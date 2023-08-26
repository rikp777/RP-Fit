package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "exercise_instruction")
public class ExerciseInstructionEntity {
    @Id
    private UUID id;

    private Integer stepNumber;
    private String instruction;

    //Relationships

    @ManyToOne
    @JoinColumn(name = "exercise_id", nullable = false)
    private ExerciseEntity exercise;

    @OneToMany(mappedBy = "instruction", cascade = CascadeType.ALL)
    private List<ExerciseStepEntity> steps;
}
