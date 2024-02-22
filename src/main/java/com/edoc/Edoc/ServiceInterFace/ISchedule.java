package com.edoc.Edoc.ServiceInterFace;


import com.edoc.Edoc.model.Schedule;

import java.util.List;

public interface ISchedule {

    // adding the schedule
    Schedule addSch(Schedule schdule);

    // delete the Schedule id
    void deleteSch(int id);

    // get one id from schedule
    Schedule getOne(int id);

    // get all dta from schedule
    List<Schedule> getAll();


}
