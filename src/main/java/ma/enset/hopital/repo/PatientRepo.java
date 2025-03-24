package ma.enset.hopital.repo;

import ma.enset.hopital.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PatientRepo extends JpaRepository<Patient,Long> {
}
