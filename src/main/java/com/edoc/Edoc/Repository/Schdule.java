package com.edoc.Edoc.Repository;

import com.edoc.Edoc.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Schdule extends JpaRepository<Schedule, Integer> {

}
