package bitlab.techorda.g1.springfirst.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    Long id;
    String name;
    String surname;
    Integer exam;
    String mark;
}
