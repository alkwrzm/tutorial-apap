package apap.tutorial.haidokter.restcontroller;

import apap.tutorial.haidokter.service.ObatRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ObatRestController {

    @Autowired
    private ObatRestService obatRestService;
}
