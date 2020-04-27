package CpuModel;

import lombok.Setter;

@Setter
public class Register {
    private String name;
    private Integer value = null;

    public Register(String name) {
        this.name = name;
        this.value = null;
    }

    public Integer getValue() {
        if(value == null)
            throw new IllegalStateException("Register value is null! " + "%" + name);
        else return value;
    }

    public String getName() {
        return name;
    }
}
