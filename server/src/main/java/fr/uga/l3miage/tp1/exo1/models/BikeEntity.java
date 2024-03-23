package fr.uga.l3miage.tp1.exo1.models;


import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class BikeEntity {
    @Id
    private String immatriculation;

    private Integer capacity;

    @Enumerated(EnumType.ORDINAL)
    private CylinderNumber cylinderNumber;

    private boolean automatic;

    private boolean shifter;

    @Enumerated(EnumType.STRING)
    private ShifterType shifterType;

    private LocalDate circulationDate;
}
