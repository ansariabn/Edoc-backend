package com.edoc.Edoc.ServiceInterFace;

import com.edoc.Edoc.model.Doctors;

import java.util.List;

public interface IDoctor {

    Doctors addDoctor(Doctors doctors);

    Doctors getOne(int id);
    List<Doctors> getAll ();

    void deleteDoc(int id);
}
