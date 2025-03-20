package com.example.Repository;

import com.example.entitties.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PatientRepo extends JpaRepository<Patient, Integer> {
    List<Patient> findByNom(String nom);
    Patient findById(int id);
    @Modifying
    @Transactional
    @Query("UPDATE Patient p SET p.nom = :nom, p.malade = :malade, p.score = :score WHERE p.id = :id")
    void updateById(@Param("id")Long id, @Param("nom") String nom, @Param("malade")boolean malade, @Param("score")int score);
    void deleteById(int id);
}
