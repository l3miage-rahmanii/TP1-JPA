package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.BrandType;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="brand_miage")
public class BrandEntity {

    @Id
    @Column(name = "siret_number")
    @Length(max = 11)
    private String siretNumber;


    private String companyName;


    @Enumerated(value = EnumType.ORDINAL)
    BrandType type;

    @OneToMany(mappedBy = "brandEntity")
    private Set<ProductEntity> productEntities;

}
