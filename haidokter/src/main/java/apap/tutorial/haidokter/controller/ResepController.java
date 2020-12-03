package apap.tutorial.haidokter.controller;

import apap.tutorial.haidokter.model.ResepModel;
import apap.tutorial.haidokter.model.ObatModel;
import apap.tutorial.haidokter.service.ObatService;
import apap.tutorial.haidokter.service.ResepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ResepController {

    @Qualifier("resepServiceImpl")
    @Autowired
    private ResepService resepService;

    @Autowired
    private ObatService obatService;

    @GetMapping("/resep/add")
    private String addResepFormPage(Model model){
        model.addAttribute("resep", new ResepModel());
        return "form-add-resep";
    }

    @PostMapping("/resep/add")
    private String addResepSubmit(
            @ModelAttribute ResepModel resep,
             Model model){
        resepService.addResep(resep);
        model.addAttribute("nomorResep", resep.getNoResep());

        return "add-resep";
    }

    @GetMapping("/resep/change/{noResep}")
    private String changeResepFormPage(
            @PathVariable Long noResep,
            Model model){
        ResepModel resep = resepService.getResepByNomorResep(noResep);
        model.addAttribute("resep", resep);

        return "form-update-resep";
    }

    @PostMapping("/resep/change")
    private String changeResepFormSubmit(
            @ModelAttribute ResepModel resep,
            Model model){
        ResepModel resepModel = resepService.updateResep(resep);
        model.addAttribute("nomorResep", resep.getNoResep());

        return "update-resep";
    }

    @GetMapping("/resep/view")
    public String viewDetailResep(
            @RequestParam(value = "noResep") Long noResep,
            Model model){
        ResepModel resep = resepService.getResepByNomorResep(noResep);

        List<ObatModel> listObat = resep.getListObat();
        model.addAttribute("resep", resep);
        model.addAttribute("listObat", listObat);
        return "view-resep";

    }

    @GetMapping("/resep/view/{noResep}")
    public String viewDetailResepPath(
            @PathVariable Long noResep,
            Model model){
        ResepModel resep = resepService.getResepByNomorResep(noResep);

        List<ObatModel> listObat = resep.getListObat();
        model.addAttribute("resep", resep);
        model.addAttribute("listObat", listObat);
        return "view-resep";

    }

    @RequestMapping("/resep/viewall")
    public String listResep(Model model) {
        List<ResepModel> listResep = resepService.getSortedResepList();


        model.addAttribute("listResep", listResep);

        return "viewall-resep";
    }

    @RequestMapping("/resep/delete/{noResep}")
    private String deleteResepFromPage(
            @PathVariable Long noResep,
            Model model){
        model.addAttribute("noResep", noResep);

        ResepModel resep = resepService.getResepByNomorResep(noResep);

        if(resep.getListObat().size() < 1) {
            resepService.deleteResep(noResep);
            return "delete-resep";
        }else {
            return "gagal-delete-resep";
        }

    }


}
