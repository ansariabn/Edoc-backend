package com.edoc.Edoc.model;

import jakarta.persistence.*;

@Entity
public class Speciality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int spId;
    private String sName;

    @OneToOne(mappedBy = "speciality", cascade = CascadeType.ALL)
    private Doctors doctor;
}
