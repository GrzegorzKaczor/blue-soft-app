package bluesoftapp.model.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SystemDto {

    private Long id;
    private String name;
    private String descriptionSystem;
    private String technologies;
    private String owner;
}
