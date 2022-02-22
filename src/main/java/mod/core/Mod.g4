grammar Mod;

parse
 : headerStatement block EOF
 /*

    @module project

    #fromq {
        Time,
        puddle,
        http,
        Files
    }

    #fromgit {
        "https://github.com/python/cpython"
    }

    #intenseq {
        [all]
    }

    loadf(project)

    load(project)
    finish[all]

 */
 ;

block :
 importStatement
 | extensiveQStatement
 | fromGitStatement
 | loadfStatement
 | loadStatement
 | finishStatement
 ;

importStatement
 : '#' 'fromq' '{' Identifier ('.' Identifier)*? '}'
 ;


extensiveQStatement
 : '[' ('all' | '*') ']'
 ;

headerStatement
 : '@' 'module' '<' Identifier '>'
 ;

fromGitStatement
 : '#' 'fromgit' '{' String '}'
 ;

loadfStatement
 : 'loadf' '(' Identifier ')'
 ;

loadStatement
 : 'load' '(' Identifier ')'
 ;

finishStatement
 : 'finish' '[' ('all' | '*') ']'
 ;

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