package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;

import java.util.UUID;

/**
 * The MetabolicPathway entity captures scientific details related to
 * how exercises affect the body on a metabolic level.
 *
 * <p>
 * This entity will help the application in giving science-backed insights
 * about various exercises.
 * </p>
 *
 * <p>
 * It includes information about the type of metabolic pathway (Aerobic or Anaerobic)
 * and an associated description.
 * </p>
 *
 * @see MetabolicPathwayType
 */
@Entity
@Table(name = "metabolic_pathway")
public class MetabolicPathwayEntity {

    /**
     * Unique identifier for the metabolic pathway.
     */
    @Id
    private UUID id;

    /**
     * Type of metabolic pathway.
     * Can be either Aerobic or Anaerobic.
     *
     * @see MetabolicPathwayType
     */
    @Enumerated(EnumType.STRING)
    private MetabolicPathwayType type;

    /**
     * Textual description detailing the specifics of the metabolic pathway.
     */
    private String description;

    /**
     * One-to-one mapping to ExerciseScience entity.
     * This establishes that each ExerciseScience record can contain one MetabolicPathway.
     *
     * @see ExerciseScienceEntity
     */
    @OneToOne(mappedBy = "metabolicPathway")
    private ExerciseScienceEntity exerciseScience;


    /**
     * Enum representing different types of metabolic pathways.
     * <ul>
     *   <li>AEROBIC_OXIDATIVE: Pathway that requires oxygen and involves the oxidation of nutrients.</li>
     *   <li>ANAEROBIC_GLYCOLYTIC: Pathway that does not require oxygen and involves the breakdown of glucose.</li>
     *   <li>ANAEROBIC_ALACTIC: Pathway that does not require oxygen and does not produce lactic acid.</li>
     * </ul>
     *
     * Each type defines a metabolic route that different exercises will follow, affecting how energy is produced and utilized in the body.
     *
     * Note: Additional types can be added as the understanding of exercise science evolves.
     */
    public enum MetabolicPathwayType {
        AEROBIC_OXIDATIVE,
        ANAEROBIC_GLYCOLYTIC,
        ANAEROBIC_ALACTIC
        // Add more types as needed
    }
}
