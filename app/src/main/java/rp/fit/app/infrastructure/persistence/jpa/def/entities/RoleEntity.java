package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "role")
public class RoleEntity {

    @Id
    private UUID id;

    @Enumerated(EnumType.STRING)
    private RoleType type;

    private String description;

    public enum RoleType {
        ADMIN,
        USER,
        TRAINER
    }
}
