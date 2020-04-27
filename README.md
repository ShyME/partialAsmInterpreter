# partialAsmInterpreter
## General info
The project demonstrates a couple of asm instructions in action, simple CPU model with few registers and a stack. Every possible action is showed in the example below. Antlr4 was used for arithmetic operation parsing.
## Example
mov (4+6)*2, %edx
push %edx*2
int 0x80
push %edx
push %ecx
int 0x80
int 0x80
mov 4 - 1, %ecx
mov 4 - , %ecx
push %ecx									
int 0x80
mov 24, %ecx
xor %ebx, %ebx
mov %ebx + 3 + %edx*2 + 5 - %ecx, %ecx
push %edx + %ecx + %ebx
int 0x80
push 215
int 0x80
mov 215, addddd
mov %ecx, 215

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
