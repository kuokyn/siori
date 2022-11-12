package com.siori_group.siori.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "user_type")
public class UserType {

    @Id
    @Column(name = "name")
    private String name;

    public UserType(String name) {
        this.name = name;
    }
    public UserType() {

    }
}
