package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

/**
 * The Innervation entity represents the neural control of a muscle.
 * This includes details like the nerve responsible for controlling the muscle,
 * the spinal level where the nerve originates, and the function of the nerve.
 */
@Entity
@Table(name = "innervation")
public class InnervationEntity {
    /**
     * The primary key for the Innervation entity.
     */
    @Id
    private UUID id;

    /**
     * The name of the nerve responsible for innervating the muscle.
     * For example, the 'Radial Nerve' innervates the triceps brachii muscle.
     */
    private String nerve;

    /**
     * Specifies the spinal cord level where the nerve originates.
     * This is usually denoted as a combination of a letter and a number,
     * representing the section and the level of the spinal cord.
     * For example, 'C5' for the fifth cervical vertebra.
     */
    private String spinalLevel;

    /**
     * Describes the primary function of the nerve in relation to the muscle.
     * This could be, for example, 'motor' for nerves that stimulate muscle contractions,
     * or 'sensory' for nerves that send sensory information to the central nervous system.
     */
    private String function;
}
