package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import javax.persistence.*;

@Entity
@Table(name="netflix_account")
public class NetflixAccount {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "nb_devices")
    private Integer nbDevices;

    @Column(name = "type_account")
    @Enumerated(EnumType.STRING)
    private TypeAccount typeAccount;

    @Column(name = "uuid_user", insertable = false, updatable = false)
    private String uuidUser;

    @OneToOne
    private NetflixUserEntity netflixUserEntity;
}
