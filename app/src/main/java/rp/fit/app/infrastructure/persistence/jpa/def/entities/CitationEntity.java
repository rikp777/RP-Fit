package rp.fit.app.infrastructure.persistence.jpa.def.entities;

import jakarta.persistence.*;

import java.util.UUID;

/**
 * The CitationEntity represents a citation or reference to scientific literature.
 * This entity is tied to the ExerciseScience entity, providing sources for scientific
 * claims or data. Each citation includes the author, year of publication, title, and source.
 */
@Entity
@Table(name = "citation")
public class CitationEntity {

    /**
     * The primary key for the CitationEntity.
     * Stored as a UUID (Universally Unique Identifier).
     */
    @Id
    private UUID id;

    /**
     * The author(s) who contributed to the cited work.
     * This can be a single author or multiple authors.
     */
    private String author;

    /**
     * The year the cited work was published.
     */
    private String year;

    /**
     * The title of the cited work.
     */
    private String title;

    /**
     * The source where the cited work can be found.
     * This could be a journal name, a conference, a website, etc.
     */
    private String source;

    //Relationships
    /**
     * A One-to-One relationship with the ExerciseScience entity.
     * This links each CitationEntity record to a specific exercise science explanation,
     * providing the source for scientific claims or data.
     */
    @OneToOne
    @JoinColumn(name = "exercise_science_id", nullable = false)
    private ExerciseScienceEntity exerciseScience;


}
