package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.UUID;

@Entity
@Table(name = "user_exercise_set")
public class UserExerciseSetEntity {

    @Id
    private UUID id;

    private Integer reps;
    private Integer weight;
    private Time time;

    @ManyToOne
    @JoinColumn(name = "user_exercise_log_id")
    private UserExerciseLogEntity userExerciseLog;
}
