package com.integrationspringboot.integrationspring.Modeles;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Voter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nationalId;
    private LocalDate dateOfBirth;
    @Column(unique = true)
    private String voterId;
    private String password;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
