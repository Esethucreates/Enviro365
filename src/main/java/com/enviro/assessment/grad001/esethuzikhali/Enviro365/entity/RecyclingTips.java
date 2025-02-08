package com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "recycling_tips")

// Lombok annotations
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames = true)
public class RecyclingTips {

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

    @Column(name = "environmental_impact_rating")
    private String impactRating;

}
