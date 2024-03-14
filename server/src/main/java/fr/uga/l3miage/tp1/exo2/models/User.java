package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name="user")
public class User {

    @Id
    private Long idUser;

    private boolean sso;


    private OffsetDateTime lastConnexion;

    @OneToOne
    private Session session;

}
