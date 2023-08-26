package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;
import rp.fit.app.infrastructure.persistence.jpa.def.enums.DifficultyEnum;
import rp.fit.app.infrastructure.persistence.jpa.def.enums.WorkoutGoalEnum;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "workout")
public class WorkoutEntity {

    @Id
    private UUID id;

    private String name;
    private String description;
    private Integer duration;

    @Enumerated(EnumType.STRING)
    private DifficultyEnum difficulty;

    //Relationships
    @OneToMany(mappedBy = "workout", cascade = CascadeType.ALL)
    private List<UserWorkoutSessionEntity> sessions;

    @ManyToMany
    @JoinTable(
            name = "workout_exercises",
            joinColumns = @JoinColumn(name = "workout_id"),
            inverseJoinColumns = @JoinColumn(name = "exercise_id")
    )
    private List<ExerciseEntity> exercises;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity creator;


}
