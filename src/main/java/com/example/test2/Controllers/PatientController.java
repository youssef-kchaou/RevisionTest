package com.example.test2.Controllers;

import com.example.test2.Entities.Pathologie;
import com.example.test2.Entities.Patient;
import com.example.test2.Services.IPatient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    IPatient patientService ;
    @PostMapping("/addPatientEtPathologie/{codep}")
    public Patient ajouterPatientEtAffecterAPathologie(@RequestBody Patient p,
                                                          @PathVariable("codep") String codePath){
        return patientService.ajouterPatientEtAffecterAPathologie(p,codePath) ;
    }

}
