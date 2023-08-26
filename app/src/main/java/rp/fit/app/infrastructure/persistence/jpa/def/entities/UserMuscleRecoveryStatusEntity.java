package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "user_muscle_recovery_status")
public class UserMuscleRecoveryStatusEntity {

    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "muscle_id")
    private MuscleEntity muscle;

    @Column(name = "last_worked_out")
    @Temporal(TemporalType.DATE)
    private Date lastWorkedOut;

    @Column(name = "recovery_level")
    private Float recoveryLevel;

    @Column(name = "next_recommend_workout")
    @Temporal(TemporalType.DATE)
    private Date nextRecommendWorkout;

    @Column(name = "current_color_code")
    private String currentColorCode;

    @Column(name = "muscle_recovery_percentage")
    private Integer muscleRecoveryPercentage;

    @Column(name = "fatigue_level")
    private Float fatigueLevel;

    @Column(name = "muscle_temperature")
    private Float muscleTemperature;
}

