package com.edoc.Edoc.ServiceInterFace;

import com.edoc.Edoc.model.Patient;

import java.util.List;

public interface IPatient {

    Patient addPatient(Patient patient);

    Patient getone(int id );

    List<Patient> getAll();

    void deletePa(int id);
}
