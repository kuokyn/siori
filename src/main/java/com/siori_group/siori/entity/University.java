package com.siori_group.siori.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="university")
public class University {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="long_name")
    private String longName;

    @Column(name="short_name")
    private String shortName;

    public University(String longName, String shortName) {
        this.longName = longName;
        this.shortName = shortName;
    }

    public University() {

    }
}
