package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;
import rp.fit.app.domain.aggregates.exercise.child.ExerciseInstruction;

import java.util.UUID;

@Entity
@Table(name = "exercise_step")
public class ExerciseStepEntity {
    @Id
    private UUID id;

    private String description;
    private String media;

    @ManyToOne
    @JoinColumn(name = "exercise_instruction_id", nullable = false)
    private ExerciseInstructionEntity instruction;
}
