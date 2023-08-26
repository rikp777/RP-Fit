package rp.fit.app.domain.aggregates.workout;

import rp.fit.app.domain.aggregates.exercise.ExerciseId;

import java.util.List;
import java.util.UUID;

public class Workout {
    private final UUID id;
    private final String name;
    private final String description;
    private final List<ExerciseId> exerciseIds;

    public Workout(UUID id, String name, String description, List<ExerciseId> exerciseIds) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.exerciseIds = exerciseIds;
    }
}
