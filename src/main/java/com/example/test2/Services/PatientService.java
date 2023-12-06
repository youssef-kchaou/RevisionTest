package com.example.test2.Services;

import com.example.test2.Entities.Pathologie;
import com.example.test2.Entities.Patient;
import com.example.test2.Repository.PathologieRepo;
import com.example.test2.Repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService implements IPatient{
    @Autowired
    PatientRepo patientRepo ;
    @Autowired
    PathologieRepo pathologieRepo ;

    @Override
    public Patient ajouterPatientEtAffecterAPathologie(Patient p, String codePath) {
        Pathologie path =pathologieRepo.findAllByCodePath(codePath) ;
        p.getPathologies().add(path);
        return patientRepo.save(p);
    }
}
