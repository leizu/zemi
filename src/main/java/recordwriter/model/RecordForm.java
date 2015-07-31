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
    private Integer stamina;
    
    @NotNull
    @Size(min = 1,max=10)
    private Integer attack;
   
    @NotNull
    @Size(min = 1,max=10)
    private Integer defense;
}
