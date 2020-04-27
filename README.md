# partialAsmInterpreter
## General info
The project demonstrates a couple of asm instructions in action, simple CPU model with few registers and a stack. Every possible action is showed in the example below. Antlr4 was used for arithmetic operation parsing.
## Example
```
mov (4+6)*2, %edx							          //edx=20
push %edx*2
int 0x80                                        //output
push %edx
push %ecx
int 0x80                                        //output
int 0x80                                        //output
mov 4 - 1, %ecx                                 //ecx=3
mov 4 - , %ecx								                  //error
push %ecx				
int 0x80                                        //output
mov 24, %ecx                                    //ecx=24
xor %ebx, %ebx                                  //ebx=0
mov %ebx + 3 + %edx*2 + 5 - %ecx, %ecx          //ecx=24
push %edx + %ecx + %ebx
int 0x80                                        //output
push 215
int 0x80                                        //output
mov 215, addddd                                 //error
mov %ecx, 215                                   //error

output:
40
???
20
Error
3
44
215
Error
Error
```
