package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;
import rp.fit.app.infrastructure.persistence.jpa.def.enums.MuscleActionTypeEnum;

import java.util.UUID;

@Entity
@Table(name = "muscle_action")
public class MuscleActionEntity {
    @Id
    private UUID id;

    @Enumerated(EnumType.STRING)
    private MuscleActionTypeEnum type;

    private String description;
    private Float speed;
    private Float force;
}
