package guru.springframework.recipe.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class UnitOfMeasure {

    private String uom;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
