package ma.enset.hopital.web;

import org.springframework.ui.Model;
import lombok.AllArgsConstructor;
import ma.enset.hopital.model.Patient;
import ma.enset.hopital.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @GetMapping("/")
    public String home(Model model){
        return "index";
    }
}
