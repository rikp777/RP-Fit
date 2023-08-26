package rp.fit.app.infrastructure.persistence.jpa.def.entities;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "user_exercise_feedback")
public class UserExerciseFeedBackEntity {

    @Id
    private UUID id;

    private Integer rating;
    private String comment;

    //Relationships
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private ExerciseEntity exercise;
}
