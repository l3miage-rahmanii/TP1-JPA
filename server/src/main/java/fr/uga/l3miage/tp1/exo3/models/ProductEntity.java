package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

@Entity
@Table
public class ProductEntity {

    @Id
    private String bar_code_number;


    private String name;


    private boolean consumable;

    @ManyToOne
    private BrandEntity brandEntity;

}
