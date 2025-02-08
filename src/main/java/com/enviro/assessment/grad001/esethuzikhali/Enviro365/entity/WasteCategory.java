package com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "waste_category")

// Lombok annotations
public class WasteCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "description")
    private String description;

    @Column(name = "common_examples")
    private String commonExamples;


    public WasteCategory(int id, String categoryName, String description, String commonExamples) {
        this.id = id;
        this.categoryName = categoryName;
        this.description = description;
        this.commonExamples = commonExamples;
    }

    public WasteCategory() {
    }

    public int getId() {
        return this.id;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCommonExamples() {
        return this.commonExamples;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCommonExamples(String commonExamples) {
        this.commonExamples = commonExamples;
    }

    public String toString() {
        return "WasteCategory(id=" + this.getId() + ", categoryName=" + this.getCategoryName() + ", description=" + this.getDescription() + ", commonExamples=" + this.getCommonExamples() + ")";
    }
}
