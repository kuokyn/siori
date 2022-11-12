package com.siori_group.siori.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "course")
public class Course {
    @Id
    @Column(name = "code")
    private String id;
    @Column(name = "places")
    private Integer places;

    @Column(name = "min_score")
    private Integer minScore;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "description")
    private String description;

    @Column(name = "criteria")
    private String criteria;

    @Column(name = "qualification")
    private String qualification;

    @Column(name = "previous_scores")
    private String previous_scores;


    public Course() {

    }
}
