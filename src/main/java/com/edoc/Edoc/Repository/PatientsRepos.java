package com.edoc.Edoc.Repository;

import com.edoc.Edoc.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientsRepos extends JpaRepository<Patient, Integer> {

    
}
