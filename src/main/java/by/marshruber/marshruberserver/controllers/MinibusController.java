package by.marshruber.marshruberserver.controllers;

import by.marshruber.marshruberserver.models.MiniBus;
import by.marshruber.marshruberserver.services.MinibusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class MinibusController {

    @Autowired
    MinibusService minibusService;

    @GetMapping("/allMinibuses")
    public List<MiniBus> getAllMniBuses(){
        return minibusService.getAllMiniBuses();
    }
}
