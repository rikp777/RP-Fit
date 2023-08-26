package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "user_workout_session")
public class UserWorkoutSessionEntity {

    @Id
    private UUID id;

    private Date date;
    private Integer duration;

    //Relationships
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "workout_id")
    private WorkoutEntity workout;
}
