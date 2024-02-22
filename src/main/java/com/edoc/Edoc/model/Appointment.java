package com.edoc.Edoc.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appId;
    private Long appNumber;
    private LocalDate appDate;


    @OneToOne
    @JoinColumn (name = "pid")
    private Patient patient;
    @OneToOne
    @JoinColumn(name = "schId")
    private Schedule schedule;

}