package com.edoc.Edoc.Services;

import com.edoc.Edoc.Repository.SchduleRepo;
import com.edoc.Edoc.ServiceInterFace.ISchedule;
import com.edoc.Edoc.model.Schedule;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService implements ISchedule {


    private final SchduleRepo schduleRepo;

    @Override
    public Schedule addSch(Schedule schdule) {
        return schduleRepo.save(schdule);
    }

    @Override
    public void deleteSch(int id) {

    }

    @Override
    public Schedule getOne(int id) {
        return null;
    }

    @Override
    public List<Schedule> getAll() {
        return null;
    }
}
