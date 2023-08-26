package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "muscle_group")
public class MuscleGroupEntity {
    @Id
    private UUID id;

    private String name;
}
