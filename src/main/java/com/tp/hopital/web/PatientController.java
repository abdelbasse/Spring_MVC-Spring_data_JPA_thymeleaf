package com.tp.hopital.web;

import com.tp.hopital.model.Patient;
import com.tp.hopital.rep.PatientRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    @Autowired
    private PatientRepo patientRepository;

    @GetMapping("/index")
    public String index(Model model){
        List<Patient> patientList = patientRepository.findAll();
        model.addAttribute("ListPatients",patientList);
        return "patients";
    }
}
