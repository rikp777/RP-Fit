package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;
import rp.fit.app.infrastructure.persistence.jpa.def.enums.MuscleFiberTypeEnum;

import java.util.UUID;

@Entity
@Table(name = "muscle_fiber_type")
public class MuscleFiberTypeEntity {
    @Id
    private UUID id;

    @Enumerated(EnumType.STRING)
    private MuscleFiberTypeEnum type;

    private String description;
    @Column(name = "oxidative_capacity")
    private Float oxidativeCapacity;
    @Column(name = "contractile_speed")
    private Float contractileSpeed;
    @Column(name = "fatigue_resistance")
    private Float fatigueResistance;
}
