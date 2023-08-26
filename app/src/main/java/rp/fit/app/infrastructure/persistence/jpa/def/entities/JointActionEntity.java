package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "joint_action")
public class JointActionEntity {

    @Id
    private UUID id;

    private String jointName;
    private String actionType;  // e.g., Flexion, Extension, etc.
    private Float angleOfMotion;

    @OneToOne
    @JoinColumn(name = "exercise_science_id", nullable = false)
    private ExerciseScienceEntity exerciseScience;
}
