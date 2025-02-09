package com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "waste_category")
public class WasteCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @Size(max = 100)
    @Column(name = "category_name", unique = true, nullable = false, length = 100)
    private String categoryName;

    @NotNull
    @Size(max = 1000)
    @Column(name = "description", nullable = false, length = 1000)
    private String description;

    @Size(max = 1000)
    @Column(name = "common_examples", length = 1000)
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
}
