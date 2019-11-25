grammar Asm;

instruction             : INSTRUCTION_TYPE expression(',' expression)? NL? EOF EOF? ;
expression              : '(' expression ')' | expression OPERATOR expression | simpleArgument ;
simpleArgument          : REGISTER | NUMBER ;


fragment DIGIT          : [0-9] ;
fragment HEX_NUMBER     : '0x' DIGIT+ ;

NL                      : [\n] ;
WS                      : [ \n\t\r]+ -> skip ;
INSTRUCTION_TYPE        : 'mov' | 'push' | 'int' | 'xor' ;
REGISTER                : '%'( 'ebx' | 'ecx' | 'edx' ) ;
OPERATOR                : '+' | '-' | '*' ;
NUMBER                  :  DIGIT+ | HEX_NUMBER ;