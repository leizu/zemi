package recordwriter.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
public class RecordForm {
    @NotNull
    @Size(min = 1,max=20)
    private String name;

    @NotNull
    @Size(min = 1,max=10)
    private int stamina;
    
    @NotNull
    @Size(min = 1,max=10)
    private int attack;
   
    @NotNull
    @Size(min = 1,max=10)
    private int defense;
}
