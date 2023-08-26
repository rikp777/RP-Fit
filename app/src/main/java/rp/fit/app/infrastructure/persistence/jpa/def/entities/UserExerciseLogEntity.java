package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "user_exercise_log")
public class UserExerciseLogEntity {

    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_workout_session_id")
    private UserWorkoutSessionEntity userWorkoutSession;

    @OneToMany(mappedBy = "userExerciseLog", cascade = CascadeType.ALL)
    private List<UserExerciseSetEntity> exerciseSets;
}
