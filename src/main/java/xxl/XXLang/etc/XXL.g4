grammar XXL;

options {

}

parse
 : block EOF
 ;

block
 : ( statement | functionDecl )* ( Return expression ';' )?
 ;

statement
 : assignment ';'
 | functionCall ';'
 | ifStatement
 | forStatement
 | whileStatement
 | importStatement ';'
 | tryCatchStatement
 | mainFunctionStatement
 | webServerStatement ';'
 | addWebServerTextStatement ';'
 | reAssignment ';'
 | classStatement
 | constructorStatement
 | defaultCall ';'
 | waitStatement ';'
 ;

assignment
 : Var Identifier indexes? '=' expression
 ;

reAssignment
 : Identifier indexes? '=' expression
 ;

functionCall
 : Identifier '(' exprList? ')' #identifierFunctionCall
 | Println '(' expression? ')'  #printlnFunctionCall
 | Print '(' expression ')'     #printFunctionCall
 | Assert '(' expression ')'    #assertFunctionCall
 | Size '(' expression ')'      #sizeFunctionCall
 | ToInt '(' expression ')'     #toIntFunctionCall
 ;

ifStatement
 : ifStat elseIfStat* elseStat? End
 ;

ifStat
 : If '(' expression ')' Do block
 ;

elseIfStat
 : Else If '(' expression ')' Do block
 ;

constructorStatement
 : '$' Identifier 'void default' '(' indexes* ')' block End
 ;

defaultCall
 : Identifier '.default' '(' ')'
 ;

elseStat
 : Else Do block
 ;

functionDecl
 : Def Identifier '(' idList? ')' block End
 ;

forStatement
 : For Identifier '=' expression To expression Do block End
 ;

importStatement
 : '#' Import Identifier ( '.' Identifier )*
 ;

tryCatchStatement
 : Try block Catch '(' Identifier ')' block End
 ; 

whileStatement
 : While '(' expression ')' Do block End
 ;

webServerStatement
 : 'create WebServer' '(' expression ')'
 ;

addWebServerTextStatement
 : AddWSText '(' expression ')'
 ;

waitStatement
 : Wait '(' expression ')'
 ;

mainFunctionStatement
 : 'void main()' block End
 ;

idList
 : Identifier ( ',' Identifier )*
 ;

classStatement
 : Class Identifier block 'endc'
 ;

exprList
 : expression ( ',' expression )*
 ;

expression
 : '-' expression                                       #unaryMinusExpression
 | '!' expression                                       #notExpression
 | <assoc=right> expression '^' expression              #powerExpression
 | expression op=( '*' | '/' | '%' ) expression         #multExpression
 | expression op=( '+' | '-' ) expression               #addExpression
 | expression op=( '>=' | '<=' | '>' | '<' ) expression #compExpression
 | expression op=( '==' | '!=' ) expression             #eqExpression
 | expression '&&' expression                           #andExpression
 | expression '||' expression                           #orExpression
 | expression '?' expression ':' expression             #ternaryExpression
 | expression In expression                             #inExpression
 | Number                                               #numberExpression
 | Bool                                                 #boolExpression
 | Null                                                 #nullExpression
 | functionCall indexes?                                #functionCallExpression
 | list indexes?                                        #listExpression
 | Identifier indexes?                                  #identifierExpression
 | String indexes?                                      #stringExpression
 | '(' expression ')' indexes?                          #expressionExpression
 | Input '(' String? ')'                                #inputExpression
 ;

list
 : '[' exprList? ']'
 ;

indexes
 : ( '[' expression ']' )+
 ;

Println  : 'std:ln';
Var      : 'var';
AddWSText: 'WebServer.changeText';
Import   : 'import';
Print    : 'std:out';
Input    : 'input';
Assert   : 'assert';
Wait     : 'wait';
Size     : 'size';
Def      : 'func';
ToInt    : 'toInt';
Create   : 'create';
WebServer: 'WebServer';
If       : 'if';
Else     : 'else';
Return   : 'return';
For      : 'for';
While    : 'while';
To       : 'to';
Do       : 'do';
End      : 'endf';
In       : 'in';
Null     : 'null';
Try      : 'try';
Catch    : 'catch';
Class    : 'class';
CreateClass : 'createClass';

Or       : '||';
And      : '&&';
Equals   : '==';
NEquals  : '!=';
GTEquals : '>=';
LTEquals : '<=';
Pow      : '^';
Excl     : '!';
GT       : '>';
LT       : '<';
Add      : '+';
Subtract : '-';
Multiply : '*';
Divide   : '/';
Modulus  : '%';
OBrace   : '{';
CBrace   : '}';
OBracket : '[';
CBracket : ']';
OParen   : '(';
CParen   : ')';
SColon   : ';';
Assign   : '=';
Comma    : ',';
QMark    : '?';
Colon    : ':';

Bool
 : 'true' 
 | 'false'
 ;

Number
 : Int ( '.' Digit* )?
 ;

Identifier
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

String
 : ["] ( ~["\r\n\\] | '\\' ~[\r\n] )* ["]
 | ['] ( ~['\r\n\\] | '\\' ~[\r\n] )* [']
 ;

Comment
 : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip
 ;

Space
 : [ \t\r\n\u000C] -> skip
 ;

fragment Int
 : [1-9] Digit*
 | '0'
 ;
  
fragment Digit 
 : [0-9]
 ;