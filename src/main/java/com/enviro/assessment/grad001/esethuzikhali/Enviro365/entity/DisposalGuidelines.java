package com.enviro.assessment.grad001.esethuzikhali.Enviro365.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "disposal_guidelines")
public class DisposalGuidelines {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @Size(max = 200)
    @Column(name = "title", nullable = false, length = 200)
    private String title;

    @NotNull
    @Size(max = 1000)
    @Column(name = "description", nullable = false, length = 1000)
    private String description;

    @NotNull
    private int wasteCatID;

    @NotNull
    @Size(max = 1000)
    @Column(name = "instructions", nullable = false, length = 1000)
    private String instructions;

    public DisposalGuidelines(int id, String title, String description, int wasteCatID, String instructions) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.wasteCatID = wasteCatID;
        this.instructions = instructions;
    }

    public DisposalGuidelines() {
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public int getWasteCatID() {
        return this.wasteCatID;
    }

    public String getInstructions() {
        return this.instructions;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWasteCatID(int wasteCatID) {
        this.wasteCatID = wasteCatID;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String toString() {
        return "DisposalGuidelines(id=" + this.getId() + ", title=" + this.getTitle() + ", description=" + this.getDescription() + ", wasteCatID=" + this.getWasteCatID() + ", instructions=" + this.getInstructions() + ")";
    }
}
