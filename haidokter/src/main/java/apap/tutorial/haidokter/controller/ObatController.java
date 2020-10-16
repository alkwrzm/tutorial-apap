package apap.tutorial.haidokter.controller;

import apap.tutorial.haidokter.model.ObatModel;
import apap.tutorial.haidokter.model.ResepModel;
import apap.tutorial.haidokter.service.ObatService;
import apap.tutorial.haidokter.service.ResepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ObatController {

    @Qualifier("resepServiceImpl")
    @Autowired
    ResepService resepService;

    @Autowired
    ObatService obatService;

    @GetMapping("/obat/add/{noResep}")
    private String addResepFormPage(
            @PathVariable Long noResep,
            Model model
    ){
        ObatModel obat = new ObatModel();
        ResepModel resep = resepService.getResepByNomorResep(noResep);
        obat.setResepModel(resep);
        model.addAttribute("obat", obat);

        return "form-add-obat";

    }

    @PostMapping("/obat/add")
    private String addObatSubmit(
            @ModelAttribute ObatModel obat,
            Model model
    ){
        obatService.addObat(obat);
        model.addAttribute("nama",obat.getNama());

        return "add-obat";
    }

    @RequestMapping("/obat/delete/{id}")
    private String deleteObat(
            @PathVariable Long id,
            Model model
    ){
        ObatModel obat = obatService.getObatById(id);
        model.addAttribute("id",id);
        obatService.deleteObat(obat);

        return "delete-obat";
    }

    @GetMapping("/obat/change/{id}")
    private String changeObatFormPage(
            @PathVariable Long id,
            Model model
    ){
        ObatModel obat = obatService.getObatById(id);
        model.addAttribute("obat", obat);

        return "form-update-obat";
    }

    @PostMapping("/obat/change")
    private String changeObatFormSubmit(
            @ModelAttribute ObatModel obat,
            Model model){
        ObatModel obatModel = obatService.updateObat(obat);
        model.addAttribute("id", obat.getId());

        return "update-obat";
    }

    @PostMapping(value = "/obat/delete")
    private String deleteMenuFormSubmit(@ModelAttribute ResepModel resep, Model model){
        model.addAttribute("obatCount", resep.getListObat().size());
        for (ObatModel obat : resep.getListObat()){
            obatService.deleteObatById(obat.getId());
        }
        return "delete-obat";
    }

    @GetMapping("/obat/add-multiple/{noResep}")
    private String addObatMultiple(
            @PathVariable Long noResep,
            Model model
    ){
        ResepModel resep = resepService.getResepByNomorResep(noResep);

        List<ObatModel> listObat = new ArrayList<ObatModel>();
        resep.setListObat(listObat);
        resep.getListObat().add(new ObatModel());
        model.addAttribute("resep", resep);

        return "form-add-multiple-obat";
    }

    @PostMapping(value = "/obat/add-multiple/{noResep}", params = {"save"})
    private String addObatMultipleSubmit(
            @ModelAttribute ResepModel resep,
            Model model
    ){
        ResepModel resep1 = resepService.getResepByNomorResep(resep.getNoResep());
        List<ObatModel> listObat = resep1.getListObat();
        System.out.println(listObat.size());
        for(int i = 0; i<listObat.size(); i++){
            listObat.get(i).setResepModel(resep);
            obatService.addObat(listObat.get(i));
        }
        model.addAttribute("listObat", listObat);
        return "add-obat-multiple";
    }

    @PostMapping(value = "/obat/add-multiple/{noResep}", params = {"addRow"})
    private String addRowObatMultiple(
            @ModelAttribute ResepModel resep,
            Model model
    ){
        resep.getListObat().add(new ObatModel());
        model.addAttribute("resep", resep);

        return "form-add-multiple-obat";
    }

    @PostMapping(value = "/obat/add-multiple/{noResep}", params = {"deleteRow"})
    private String deleteRowObatMultiple(
            @ModelAttribute ResepModel resep,
            final HttpServletRequest req,
            Model model
    ){
        final Integer rowId = Integer.valueOf(req.getParameter("deleteRow"));
        resep.getListObat().remove(rowId.intValue());

        model.addAttribute("resep", resep);
        return "form-add-multiple-obat";
    }
}
