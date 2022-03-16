grammar Q;

parse
 : header? ( allImport ';' )*? block EOF
 ;

block
 : ( statement | functionDecl )* ( Return expression ';' )?
 ;

statement
 : functionCall ';'
 | ifStatement
 | forStatement
 | forInStatement
 | whileStatement
 | tryCatchStatement
 | mainFunctionStatement
 | addWebServerTextStatement ';'
 | reAssignment ';'
 | classStatement
 | constructorStatement
 | windowAddCompStatement ';'
 | windowRenderStatement ';'
 | fileWriteStatement ';'
 | verifyFileStatement ';'
 | objFunctionCall (';')?
 | objCreateStatement ';'
 | osExecStatement ';'
 | anonymousFunction
 | hereStatement ';'
 | assignment ';'
 ;

reAssignment
 : ( Identifier | objVar) indexes? '=' expression
 ;

assignment
 : ( Const | Noval )*? Var Identifier ( indexes? '=' expression )?
 ;

functionCall
 : Identifier '(' exprList? ')' #identifierFunctionCall
 | Println '(' expression? ')'  #printlnFunctionCall
 | Print '(' expression ')'     #printFunctionCall
 | Assert '(' expression ')'    #assertFunctionCall
 | ToInt '(' expression ')'     #toIntFunctionCall
 | Identifier Accessor Identifier '(' exprList? ')' #objFunctionCallExpression
 ;

allImport
 : importStatement              #fileSystemImportStatement
 | importFromGithubStatement    #githubImportStatement
 | importAllStatement           #importAll
 ;

objFunctionCall
 : Identifier Accessor Identifier '(' exprList? ')'
 ;

header
 : '@' 'header' Identifier
 ;

ifStatement
 : ifStat elseIfStat* elseStat? End
 ;

ifStat
 : If '(' expression ')' block
 ;

hereStatement
 : Self Accessor Identifier '=' expression
 ;

varHereStatement
 : Self Accessor Identifier
 ;

elseIfStat
 : Else If '(' expression ')' block
 ;

constructorStatement
 : 'cn' Identifier '(' exprList? ')' block End
 ;

objCreateStatement
 : 'new' Identifier 'as' Identifier '(' exprList? ')'
 // new Object as o();
 // new FileReader as fw("files/file.txt");
 ;

osExecStatement
 : 'sys' Accessor Identifier '(' expression? ')'
 ;

fileWriteStatement
 : Identifier Accessor 'write' '(' expression ')'
 ;

verifyFileStatement
 : 'verify' '(' expression ')'
 ;

elseStat
 : Else block
 ;

functionDecl
 : ( atStatement )? ( Async | Native )*? Def Identifier '(' idList? ')' block End
 ;

forStatement
 : For '(' Identifier '=' expression To expression ')' block End
 ;

forInStatement
 : For '(' Identifier 'in' 'range' '(' expression ')' ')' block End
 ;

importStatement
 : '#' Import Identifier ( '.' Identifier )*?
 ;

anonymousFunction
 : 'fn' '(' exprList? ')' '-' '>' block End
 // fn(x, y) ->
 //     std:ln(x);
 // end
 ;

importFromGithubStatement
 : '#' 'import' expression
 ;

importAllStatement
 : '#''import' '[' '*' ']'
 ;

atStatement
 : '@' Identifier
 ;

tryCatchStatement
 : Try block 'except' block End

 /*
    try
        std::cout("hello there");
    except
        std::coutln("errr");
    end
 */

 ; 

whileStatement
 : While '(' expression ')' block End
 ;

windowRenderStatement
 : Identifier Accessor 'render' '(' ')'
 ;

windowAddCompStatement
 : Identifier Accessor 'addComp' '(' expression ')'
 ;

addWebServerTextStatement
 : Identifier Accessor 'changeText' '(' expression ')'
 ;

mainFunctionStatement
 : 'fn main()' block End
 ;

idList
 : Identifier ( ',' Identifier )*
 ;

classStatement
 : Class Identifier ( ':' Identifier )? block 'end'
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
 | varHereStatement                                     #hereVarExpression
 | 'random' '(' expression ')'                          #randomExpression
 | anonymousFunction                                    #anonymousFunctionExpression
 | varHereStatement                                     #selfExpression
 | objVar                                               #objVarExpression
 ;

list
 : '[' exprList? ']'
 ;

objVar
 : Identifier Accessor Identifier
 // charger::hp
 ;

indexes
 : ( '[' expression ']' )+
 ;

Println  : 'std' Accessor 'QAVB8KI72J65919YLC';
Async    : 'async';
Var      : 'var';
Import   : 'import';
Print    : 'std' Accessor 'AX7MRSUXQ61G8DXIZW';
Input    : 'std' Accessor 'cin';
Assert   : 'assert';
Def      : 'fn';
ToInt    : 'toInt';
If       : 'if';
Else     : 'else';
Return   : 'return';
For      : 'for';
While    : 'while';
To       : 'to';
Do       : 'do';
End      : 'end';
In       : 'in';
Null     : 'null';
Try      : 'try';
Class    : 'class';
Const    : 'const';
Noval    : 'noval';
Self     : 'self';
Native   : 'native';

Or       : '||';
Accessor : '::';
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
 : '"' (ESC | ~["\r\n\\])+ '"'
 ;

Comment
 : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip
 ;

Space
 : [ \t\r\u000C] -> skip
 ;

fragment Int
 : [1-9] Digit*
 | '0'
 ;
  
fragment Digit 
 : [0-9]
 ;

fragment ESC
 : '\\' (["\\bfnrt] | UNICODE)
 ;

fragment UNICODE
 : 'u' HEX HEX HEX HEX
 ;

fragment HEX
 : [0-9a-fA-F]
 ;