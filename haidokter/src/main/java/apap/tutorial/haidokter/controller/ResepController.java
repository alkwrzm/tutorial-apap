package apap.tutorial.haidokter.controller;

import apap.tutorial.haidokter.model.ResepModel;
import apap.tutorial.haidokter.service.ResepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ResepController {
    @Autowired
    private ResepService resepService;

    // routing url
    @RequestMapping("/resep/add")
    public String addResep(
            //request parameter
            @RequestParam(value = "noResep", required = true) String noResep,
            @RequestParam(value = "namaDokter", required = true) String namaDokter,
            @RequestParam(value = "namaPasien", required = true) String namaPasien,
            @RequestParam(value = "catatan", required = true) String catatan,
            Model model

    ) {
        // membuat object
        ResepModel resep = new ResepModel(noResep, namaDokter, namaPasien, catatan);

        resepService.addResep(resep);

        model.addAttribute("noResep", noResep);

        return "add-resep";
    }

    @RequestMapping("/resep/viewall")
    public String listResep(Model model) {
        List<ResepModel> listResep = resepService.getResepList();


        model.addAttribute("listResep", listResep);

        return "viewall-resep";
    }

    @RequestMapping("/resep/view")
    public String detailResep(
            @RequestParam(value = "noResep") String noResep,
            Model model) {
        ResepModel resep = resepService.getResepByNomorResep(noResep);

        model.addAttribute("resep", resep);
        if(noResep == null){
            return "error";
        }
        return "view-resep";
    }

    @GetMapping(value = "/resep/view/no-resep/{noResep}")
    public String viewResepWithPathVariable(
            @PathVariable(value = "noResep") String noResep,
            Model model ){
        ResepModel resep = resepService.getResepByNomorResep(noResep);
        model.addAttribute("resep", resep);
        return "view-resep";
    }

    @GetMapping(value = "/resep/update/no-resep/{noResep}/catatan/{catatan}")
    public String updateResepWithPathVariable(
            @PathVariable(value = "noResep") String noResep,
            @PathVariable(value = "catatan") String catatan,
            Model model ){
        if(noResep == null){
            return "error";
        }
        resepService.updateResep(noResep,catatan);
        model.addAttribute("noResep", noResep);
        return "update-resep";
    }

    @GetMapping(value = "/resep/delete/no-resep/{noResep}")
    public String deleteResepWithPathVariable(
            @PathVariable(value = "noResep") String noResep,
            Model model ){
        ResepModel resep = resepService.getResepByNomorResep(noResep);
        model.addAttribute("noResep", noResep);
        if(resep == null){
            return "error";
        }
        resepService.deleteResep(resep);
        return "delete-resep";
    }


}
