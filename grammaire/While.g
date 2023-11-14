grammar While;

options {
	output=AST;
}

tokens
{
	FUNCTION ;
	DEFINITION ;
	COMMANDS;
	INPUT;
	OUTPUT;
	ASSIGN;
	CONS;
	IF;
	WHILE;
	FOR;
	FOREACH;
	TEST;
	EXPR;
	LIST;
	HD;
	TL;
}

VARIABLE :	 ('A'..'Z')('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?')?;

SYMBOL :	 ('a'..'z')('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?')?;

exprBase :	
	('nil' | VARIABLE | SYMBOL)
	| '(' 'cons' lExpr ')' -> ^(CONS lExpr)
	| '(' 'list' lExpr ')' -> ^(LIST lExpr)
	| '(' 'hd' exprBase ')' -> ^(HD exprBase)
	| '(' 'tl' exprBase ')' -> ^(TL exprBase)
	| '(' SYMBOL lExpr ')' -> ^(SYMBOL lExpr);

lExpr :	
	(exprBase lExpr)?;

expression :
	exprBase ('=?' exprBase)? -> ^(EXPR exprBase exprBase?);

vars :
	VARIABLE (','! vars)?;

exprs :
	expression (','! exprs)?;
	
output :
	VARIABLE (','! output)?;
	
inputSub :
	VARIABLE (','! inputSub)?;

input :
	inputSub? -> ^(INPUT inputSub?);

commands :
	command (';'! commands )?;
	
command :
	('nop')
	| (vars ':=' exprs) -> ^(ASSIGN vars exprs)
	| ('if' expression 'then' commands ('else' commands)? 'fi') -> ^(IF expression commands commands?)
	| ('while' expression 'do' commands 'od') -> ^(WHILE expression commands)
	| ('for' expression 'do' commands 'od') -> ^(FOR expression commands)
	| ('foreach' VARIABLE 'in' expression 'do' commands 'od') -> ^(FOREACH VARIABLE expression commands);
	
definition :
	'read' input '%' commands '%' 'write' output -> ^(DEFINITION input ^(COMMANDS commands) ^(OUTPUT output));
	
function :
	'function' SYMBOL ':' definition -> ^(FUNCTION SYMBOL definition);
	
program :
	function program?;
	