package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    private UUID id;
    private String email;
    private String password;
    private String username;
    private Boolean isDeleted;

    //Relationships
    @ManyToMany
    @JoinTable(
        name = "user_role",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<RoleEntity> roles;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserMuscleRecoveryStatusEntity> muscleRecoveryStatusList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserMuscleProfileEntity> muscleProfileList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserWorkoutSessionEntity> workoutSessionList;

    @OneToMany(mappedBy = "owner")
    private List<WorkoutPlanEntity> ownedWorkoutPlans;

    @OneToMany(mappedBy = "creator")
    private List<WorkoutEntity> createdWorkouts;
}
