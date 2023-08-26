package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;
import rp.fit.app.infrastructure.persistence.jpa.def.enums.DifficultyEnum;
import rp.fit.app.infrastructure.persistence.jpa.def.enums.ExerciseCategoryEnum;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "exercise")
public class ExerciseEntity {
    @Id
    private UUID id;

    private String name;
    private String description;
    private String duration;

    @Enumerated(EnumType.STRING)
    private DifficultyEnum difficulty;

    @Enumerated(EnumType.STRING)
    private ExerciseCategoryEnum category;

    private String videoURL;


    @ManyToMany
    @JoinTable(
            name = "exercise_muscles",
            joinColumns = @JoinColumn(name = "exercise_id"),
            inverseJoinColumns = @JoinColumn(name = "muscle_id")
    )
    private List<MuscleEntity> muscles;

    @ManyToMany(mappedBy = "exercises")
    private List<WorkoutEntity> workouts;

    @OneToMany(mappedBy = "exercise", cascade = CascadeType.ALL)
    private List<ExerciseInstructionEntity> instructions;
}
