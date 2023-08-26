package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;
import rp.fit.app.infrastructure.persistence.jpa.def.enums.WorkoutGoalEnum;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "workout_plan")
public class WorkoutPlanEntity {

    @Id
    private UUID id;

    private String name;

    @Enumerated(EnumType.STRING)
    private WorkoutGoalEnum goal;

    @ManyToMany
    @JoinTable(
            name = "workout_exercises",
            joinColumns = @JoinColumn(name = "workout_id"),
            inverseJoinColumns = @JoinColumn(name = "exercise_id")
    )
    private List<ExerciseEntity> exercises;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity owner;
}
