package com.edoc.Edoc.ServiceInterFace;

import com.edoc.Edoc.model.Speciality;

import java.util.List;

public interface ISpecility {

    Speciality addSpec(Speciality speciality);

    Speciality getOne(int id);

    List<Speciality> getAll();

    void deleteSpe(int id);
}
