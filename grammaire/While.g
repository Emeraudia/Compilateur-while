grammar While;

VARIABLE :	 ('A'..'Z')('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?')?;

SYMBOL :	 ('a'..'z')('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?')?;

exprBase :	
	('nil' | VARIABLE | SYMBOL)
	| ( ('(' 'cons' lExpr ')') | ('(' 'list' lExpr ')'))
	| ( ('(' 'hd' exprBase ')') | ('(' 'tl' exprBase ')'))
	| ( '(' SYMBOL lExpr ')');

lExpr :	
	(exprBase lExpr)?;

expression :
	exprBase ('=?' exprBase)?;

vars :
	VARIABLE (',' vars)?;

exprs :
	expression (',' exprs)?;
	
output :
	VARIABLE (',' output)?;
	
inputSub :
	VARIABLE (',' inputSub)?;

input :
	inputSub?;

commands :
	command (';' commands )?;
	
command :
	('nop')
	| (vars ':=' exprs)
	| ('if' expression 'then' commands ('else' commands)? 'fi')
	| ('while' expression 'do' commands 'od')
	| ('for' expression 'do' commands 'od')
	| ('foreach' VARIABLE 'in' expression 'do' commands 'od');

definition :
	'read' input '%' commands '%' 'write' output;
	
function :
	'function' SYMBOL ':' definition;
	
program :
	function program?;	