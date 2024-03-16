package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class AssociationEntity {

    @Id
    private String name;

    @Column(nullable = false)
    private String presidentName;

    @Column(nullable = false)
    private String treasurerName;

    private String secretaryName;

    @Enumerated(EnumType.ORDINAL)
    private AssociationType associationType;

    @ManyToOne
    @JoinColumn(foreignKey=@ForeignKey(name = "Fk_association_federation"))
    private FederationEntity federation;

    @OneToMany(mappedBy = "association")
    private Set<FederationEntity> federations;
}
