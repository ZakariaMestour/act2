package com.example.Repository;

import com.example.entitties.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepo extends JpaRepository<Patient, Integer> {
    List<Patient> findByNom(String nom);
}
