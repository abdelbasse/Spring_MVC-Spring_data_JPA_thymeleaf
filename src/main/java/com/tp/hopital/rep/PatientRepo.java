package com.tp.hopital.rep;


import com.tp.hopital.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PatientRepo extends JpaRepository<Patient,Long> {
}
