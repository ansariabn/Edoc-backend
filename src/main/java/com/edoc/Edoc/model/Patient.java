package com.edoc.Edoc.model;
//
import jakarta.persistence.*;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    private String pEmail;
    private String pName;
    private String pPassword;
    private String pAddresh;
    private Long pNic;

    private Long pTel;

    @OneToOne
    @JoinColumn(name = "pdoc")
    private Doctors doctors;
    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL)
    private Appointment appointment;

}
