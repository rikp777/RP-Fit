package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "muscle_activation")
public class MuscleActivationEntity {

    @Id
    private UUID id;

    private String muscle;
    private Float activationLevel;

    @ManyToOne
    @JoinColumn(name = "exercise_science_id", nullable = false)
    private ExerciseScienceEntity exerciseScience;


}
