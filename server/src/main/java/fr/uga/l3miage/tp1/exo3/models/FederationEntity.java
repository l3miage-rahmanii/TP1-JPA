package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.BrandType;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="federation")
public class FederationEntity {

    @Id
    private String name;

    private boolean isFageMembership;

    @ManyToOne
    @JoinColumn(foreignKey=@ForeignKey(name = "Fk_federation_association"))
    AssociationEntity association;

    @OneToMany(mappedBy = "federationEntity")
    private Set<AssociationEntity> associationEntities;

}
