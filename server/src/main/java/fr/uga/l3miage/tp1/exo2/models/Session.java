package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="session")
public class Session {

    @Id
    @Column(name = "id_session")
    private UUID idSession;

    @Column(name = "last_command")
    private String lastCommand;

    @Column(name = "current_dir")
    private String currentDir;

    @Column(name = "lock")
    private boolean lock;

    @OneToOne(mappedBy = "session")
    private User user;

}