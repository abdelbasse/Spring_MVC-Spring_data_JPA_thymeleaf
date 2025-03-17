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

		patientRepository.save(new Patient(null,"yassin",new Date(),false,123));
		patientRepository.save(new Patient(null,"Ahmad",new Date(),true,2));
		patientRepository.save(new Patient(null,"hanan",new Date(),false,10));


	}

}
