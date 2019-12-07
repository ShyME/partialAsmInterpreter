package Asm;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InstructionData {
    private String type;
    private String param1;
    private String param2;

    public String toString() {
        return "Type: " + type + "; Param1: " + param1 + "; Param2: " + param2;
    }
}
