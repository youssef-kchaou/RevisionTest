package com.example.test2.Repository;

import com.example.test2.Entities.Pathologie;
import com.example.test2.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {
}
