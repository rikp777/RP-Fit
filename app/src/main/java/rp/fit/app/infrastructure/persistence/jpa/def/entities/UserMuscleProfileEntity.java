package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "user_muscle_profile")
public class UserMuscleProfileEntity {

    @Id
    private UUID id;

    private Float muscleStrength;
    private Float muscleEndurance;
    private Float muscleWeakness;

    //Relationships

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "muscle_id")
    private MuscleEntity muscle;


}
