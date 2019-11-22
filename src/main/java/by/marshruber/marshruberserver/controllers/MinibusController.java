package by.marshruber.marshruberserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinibusController {

//    @Autowired
//    MinibusService minibusService;

    @GetMapping("/index")
    public String index() {
        return "Hello Word";
    }
}
