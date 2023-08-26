package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;
import rp.fit.app.infrastructure.persistence.jpa.def.enums.DifficultyEnum;

import java.sql.Time;
import java.time.DayOfWeek;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "user_preference")
public class UserPreferencesEntity {
    @Id
    private UUID id;

    @Column(name = "color_scheme")
    private String colorScheme;

    @Column(name = "notification_enabled")
    private Boolean notificationEnabled;

    @Column(name = "preferred_workout_time")
    private Time preferredWorkoutTime;

    @Column(name = "preferred_workout_duration")
    private Integer preferredWorkoutDuration;

    @ElementCollection(targetClass = DayOfWeek.class)
    @CollectionTable(name = "user_preferred_workout_days", joinColumns = @JoinColumn(name = "preferences_id"))
    @Enumerated(EnumType.STRING)
    private List<DayOfWeek> preferredWorkoutDays;

    @Column(name = "preferred_workout_difficulty")
    @Enumerated(EnumType.STRING)
    private DifficultyEnum preferredWorkoutDifficulty;

    //Relationships
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
