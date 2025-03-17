package com.tp.hopital;

import com.tp.hopital.model.Patient;
import com.tp.hopital.rep.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {

	@Autowired
	private PatientRepo patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(HopitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		Patient patient = new Patient();

		patient.setId(null);
		patient.setNom("Mohamad");
		patient.setDateNaissance(new Date());
		patient.setMalade(false);
		patient.setScore(23);

		Patient patient1 = new Patient(null,"yassin",new Date(),false,123);
		

	}

}
