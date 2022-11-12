package com.siori_group.siori.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="discipline")
public class Discipline {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title")
    private String title;


    public Discipline(String title) {
        this.title = title;
    }

    public Discipline() {

    }
}
