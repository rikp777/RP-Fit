package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;

import java.util.UUID;

/**
 * The Biomechanics entity represents the biomechanical aspects of an exercise.
 * This includes the angles, forces, and torques applied to various joints during the exercise.
 * It is closely related to the ExerciseScience entity and aims to offer a scientific
 * understanding of how the exercise affects the body biomechanically.
 */
@Entity
@Table(name = "biomechanics")
public class BiomechanicsEntity {
    /**
     * The primary key for the Biomechanics entity.
     * Stored as a UUID (Universally Unique Identifier).
     */
    @Id
    private UUID id;

    /**
     * Describes the angles at which joints are positioned or move during the exercise.
     * This could be a JSON string or a more complex object depending on your needs.
     */
    private String jointAngles;

    /**
     * Specifies the forces applied to the joints during the exercise.
     * This can help understand the stress levels on particular joints.
     */
    private String forces;

    /**
     * Describes the torques (rotational forces) that are applied to joints during the exercise.
     * This can help in understanding the complexity of the exercise in terms of rotational movement.
     */
    private String torques;

    /**
     * A One-to-One relationship with the ExerciseScience entity.
     * This links each Biomechanics record to a specific exercise science explanation.
     */
    @OneToOne
    @JoinColumn(name = "exercise_science_id", nullable = false)
    private ExerciseScienceEntity exerciseScience;
}
