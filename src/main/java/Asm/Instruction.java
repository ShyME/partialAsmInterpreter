package Asm;

public interface Instruction {
    void execute();
    void setParams(String a, String b);
}
