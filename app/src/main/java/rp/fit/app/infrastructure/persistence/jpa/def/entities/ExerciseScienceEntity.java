package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "exercise_science")
public class ExerciseScienceEntity {
    @Id
    private UUID id;

    private String study;
    private String findings;

    @OneToOne(mappedBy = "exerciseScience", cascade = CascadeType.ALL)
    private CitationEntity citation;

    @OneToOne(mappedBy = "exerciseScience", cascade = CascadeType.ALL)
    private JointActionEntity jointActivations;

    @OneToOne(mappedBy = "exerciseScience", cascade = CascadeType.ALL)
    private BiomechanicsEntity biomechanics;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "metabolic_pathway_id")
    private MetabolicPathwayEntity metabolicPathway;

    @OneToMany(mappedBy = "exerciseScience", cascade = CascadeType.ALL)
    private List<MuscleActivationEntity> muscleActivations;
}
