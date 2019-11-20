package by.marshruber.marshruberserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class MinibusController {

    @GetMapping("/allMinibuses")
    public List<Object> getAllMnibuses(){
        return null;
    }
}
