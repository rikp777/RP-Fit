package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;
import rp.fit.app.infrastructure.persistence.jpa.def.enums.MuscleFiberTypeEnum;
import rp.fit.app.infrastructure.persistence.jpa.def.enums.MuscleTypeEnum;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "muscle")
public class MuscleEntity {

    @Id
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "function")
    private String function;


    //Relationships
    @ManyToOne
    @JoinColumn(name = "muscle_group_id")
    private MuscleGroupEntity muscleGroup;

    @OneToMany(mappedBy = "muscle", cascade = CascadeType.ALL)
    private List<UserMuscleRecoveryStatusEntity> muscleRecoveryStatusList;

    @OneToMany(mappedBy = "muscle", cascade = CascadeType.ALL)
    private List<UserMuscleProfileEntity> muscleProfileList;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "muscle_fiber_type_id")
    private MuscleFiberTypeEntity muscleFiberType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "innervation_id")
    private InnervationEntity innervation;
}
