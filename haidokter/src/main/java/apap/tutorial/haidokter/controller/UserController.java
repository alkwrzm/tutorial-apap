package apap.tutorial.haidokter.controller;

import apap.tutorial.haidokter.model.UserModel;
import apap.tutorial.haidokter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.result.view.RedirectView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    private String addUserSubmit(@ModelAttribute UserModel userModel,
                                       RedirectAttributes attributes) {
        String a = userService.addUser(userModel);
        attributes.addFlashAttribute("notif", a);
        return "redirect:/";
    }

    @RequestMapping(value = "/update-password", method = RequestMethod.GET)
    private String updatePasswordForm(
           Model model){
        return "update-password";
    }

    @RequestMapping(value = "/update-password", method = RequestMethod.POST)
    private String changePasswordSubmit(
            @RequestParam(value = "passwordOld") String passwordOld,
            @RequestParam(value = "passwordNew") String passwordNew,
            @RequestParam(value = "passwordNew2") String passwordNew2,
            HttpServletRequest request,
            RedirectAttributes attributes,
            Model model
    ) {
        Principal principal = request.getUserPrincipal();
        UserModel user = userService.findUserByNama(principal.getName());
        if(!passwordNew.equals(passwordNew2)){
            model.addAttribute("notif", "Password baru tidak match, mohon input ulang");
            return "update-password";
        }
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        if(passwordEncoder.matches(passwordOld, user.getPassword())){
            String a = userService.changePassword(user, passwordNew);
            attributes.addFlashAttribute("notif", a);
            return "redirect:/user/update-password";
        }
        else{
            model.addAttribute("notif", "Password lama salah, mohon input ulang");
            return "update-password";
        }
    }

}
