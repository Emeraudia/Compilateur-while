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
	VAR;
	SYM;
	NIL;
	FUNC;
	PP;
}

@rulecatch {
    catch (Exception e)
    {
        exceptions.add(e);
    }
}

@parser::members {
    public java.util.List<Exception> exceptions = new java.util.ArrayList<Exception>();
    
    @Override    
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
    	exceptions.add(e);
    }
}

@lexer::members {
    public java.util.List<Exception> exceptions = new java.util.ArrayList<Exception>();
    
    @Override    
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
    	exceptions.add(e);
    }
}

program :
	function program?;

VARIABLE :	 ('A'..'Z')('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?')?;

SYMBOL :	 ('a'..'z')('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?')?;

exprBase :	
	'nil' -> NIL
	| VARIABLE -> ^(VAR VARIABLE)
	| SYMBOL -> ^(SYM SYMBOL)
	| '(' 'cons' lExpr ')' -> ^(CONS lExpr)
	| '(' 'list' lExpr ')' -> ^(LIST lExpr)
	| '(' 'hd' exprBase ')' -> ^(HD exprBase)
	| '(' 'tl' exprBase ')' -> ^(TL exprBase)
	| '(' SYMBOL lExpr ')' -> ^( FUNC SYMBOL lExpr?);

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
	| ('if' expression 'then' commands ('else' commands)? 'fi') -> ^(IF expression ^(COMMANDS commands) ^(COMMANDS commands)?)
	| ('while' expression 'do' commands 'od') -> ^(WHILE expression ^(COMMANDS commands))
	| ('for' expression 'do' commands 'od') -> ^(FOR expression ^(COMMANDS commands))
	| ('foreach' VARIABLE 'in' expression 'do' commands 'od') -> ^(FOREACH VARIABLE expression ^(COMMANDS commands))
	| ('pp(' expression ')') -> ^(PP expression) ;
	
definition :
	'read' input '%' commands '%' 'write' output -> ^(DEFINITION input ^(COMMANDS commands) ^(OUTPUT output));
	
function :
	'function' SYMBOL ':' definition -> ^(FUNCTION SYMBOL definition);
	
