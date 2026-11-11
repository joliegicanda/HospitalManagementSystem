package com.example.HospitalManagement.Controller;

import com.example.HospitalManagement.Model.patients;
import com.example.HospitalManagement.Repository.PatientRepository;
import com.example.HospitalManagement.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService service;

    @PostMapping
    public patients createPatient(@RequestBody patients patient) {

        return service.savePatient(patient);
    }

    @GetMapping("/all")
    public List<patients> getAllPatients() {
        return service.getAllPatients();
    }

    @GetMapping("/{email}")
    public patients getPatient(@PathVariable String email){
        return  service.getPatientByEmail(email);
    }
}
