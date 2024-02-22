package com.edoc.Edoc.ServiceInterFace;

import com.edoc.Edoc.model.Appointment;

import java.util.List;

public interface IAppoinment {

    Appointment addApp(Appointment appointment);

    Appointment getOne(int id);

   List <Appointment> getAll ();

    void deleteOne(int id);


}
