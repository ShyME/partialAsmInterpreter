grammar Asm;

instruction             : INSTRUCTION_TYPE argument ',' targetParam NL? EOF? # DoubleArgumentInstruction
                        | INSTRUCTION_TYPE argument NL? EOF? # SingleArgumentInstruction ;
targetParam             : REGISTER ;
argument                : addSubtractExpr # Expression
                        | HEX_NUMBER # HexNumb ;
addSubtractExpr         : addSubtractExpr PLUS multExpr # Addition
                        | addSubtractExpr MINUS multExpr # Subtraction
                        | multExpr # ToMultExpr ;
multExpr                : multExpr TIMES minusExpr # Multiplication
                        | minusExpr # ToMinusExpr;
minusExpr               : MINUS unaryArgument # SignChange
                        | unaryArgument # ToSimpleArgument;
unaryArgument           : REGISTER # Reg
                        | signedNumber # SignedNumb
                        | '(' addSubtractExpr ')' # Braces ;
signedNumber            : NUMBER
                        | MINUS NUMBER ;

fragment DIGIT          : [0-9] ;

HEX_NUMBER              : '0x' DIGIT+ ;
WS                      : [ \t\r]+ -> skip ;
NL                      : [\n] ;
INSTRUCTION_TYPE        : 'mov' | 'push' | 'int' | 'xor' ;
REGISTER                : '%'( 'ebx' | 'ecx' | 'edx' ) ;
PLUS                    : '+' ;
MINUS                   : '-' ;
TIMES                   : '*' ;
NUMBER                  : DIGIT+;