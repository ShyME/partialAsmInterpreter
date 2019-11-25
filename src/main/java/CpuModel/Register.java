package CpuModel;

import lombok.Data;

@Data
public class Register {
    private String name;
    private Integer value;

    public Register(String name) {
        this.name = name;
        this.value = null;
    }
}
