package com.example;

import com.example.Repository.PatientRepo;
import com.example.entitties.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private PatientRepo patientRepo;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		patientRepo.save(new Patient(null,"zakaria",new SimpleDateFormat("dd-MM-yyyy").parse("30-08-2003"),true,20));
		patientRepo.save(new Patient(null,"Reda",new SimpleDateFormat("dd-MM-yyyy").parse("3-09-2000"),false,80));
		patientRepo.save(new Patient(null,"Ahmed",new SimpleDateFormat("dd-MM-yyyy").parse("11-01-1999"),true,90));
	}
}
