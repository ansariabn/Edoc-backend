package com.edoc.Edoc.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int scheduleId;

    private String Title;
    private LocalDate schedulDate ;
    private LocalTime schdeuleTime;
    private int NumberPatient;


    @OneToOne
    @JoinColumn(name = "docid")
    private Doctors doctor;


    @OneToOne(mappedBy = "schedule", cascade = CascadeType.ALL)
    private Appointment appointment;
}
