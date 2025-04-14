package ma.enset.hopital.web;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.Model;
import lombok.AllArgsConstructor;
import ma.enset.hopital.model.Patient;
import ma.enset.hopital.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class PatientController {
    @Autowired
    private PatientRepo patientRepository;

    @GetMapping("/index")
    public String index(Model model,
                        @RequestParam(name = "page" , defaultValue = "0") int page,
                        @RequestParam(name = "size",defaultValue = "5") int size,
                        @RequestParam(name = "keyword" , defaultValue = "") String kw){
//        Page<Patient> pagePatientList = patientRepository.findAll(PageRequest.of(page,size));
        Page<Patient> pagePatientList = patientRepository.findByNomContains(kw,PageRequest.of(page,size));

        model.addAttribute("ListPatients",pagePatientList.getContent());
        model.addAttribute("pages",new int[pagePatientList.getTotalPages()]);
        model.addAttribute("currentPage",page);
        model.addAttribute("keyword",kw);
        return "patients";
    }
    //    public String index(Model model, HttpServletRequest request)
//    {
//        int page = Integer.parseInt(request.getParameter("page"));
//        int size = Integer.parseInt(request.getParameter("size"));
//        Page<Patient> pagePatientList = patientRepository.findAll(PageRequest.of(page,size));
//        model.addAttribute("ListPatients",pagePatientList.getContent());
//        model.addAttribute("pages",new int[pagePatientList.getTotalPages()]);
//        return "patients";
//    }

    @GetMapping("/")
    public String home(Model model){
        return "index";
    }
}
