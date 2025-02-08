package com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "disposal_guidelines")

// Lombok annotations
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames = true)
public class DisposalGuidelines {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "waste_category_id")
    private int wasteCatID;

    @Column(name = "instructions")
    private String instructions;
}
