package com.siori_group.siori.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User implements UserDetails {


    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

    @Id
    @Column(name = "phone")
    private String phone;
    @Column(name = "password")
    private String password;

    @OneToOne
    @JoinColumn(name = "user_type")
    private UserType userType;
    @Column(name = "email")
    private String email;

    @ManyToMany
    @JoinTable(
            name = "user_authority",
            joinColumns = {@JoinColumn(name = "user_phone", referencedColumnName = "phone")},
            inverseJoinColumns = {@JoinColumn(name = "authority_title", referencedColumnName = "title")})
    private Set<Authority> authorities = new HashSet<>();

    public User(String name, String password, String surname, String phone, UserType userType, String email) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.password = password;
        this.userType = userType;
        this.email = email;
    }

    public User() {

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<Authority> authList;
        authList = this.authorities;
        return (Collection<? extends GrantedAuthority>) authList;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.phone;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
