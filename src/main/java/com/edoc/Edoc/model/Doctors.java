package com.edoc.Edoc.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Doctors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dId;
    private String dEmail;
    private String dName ;
    private String dPassword;

    private Long dnic;
    private Long dTel;

    @OneToOne
    @JoinColumn(name = "dspecial")
    private Speciality speciality;


    @OneToOne(mappedBy = "doctors", cascade = CascadeType.ALL)
    private Patient patient;


    @OneToOne(mappedBy = "doctor")
    private Schedule shedule;
}
