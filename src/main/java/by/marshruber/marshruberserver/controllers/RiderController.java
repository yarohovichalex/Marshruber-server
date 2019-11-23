package by.marshruber.marshruberserver.controllers;

import by.marshruber.marshruberserver.models.Rider;
import by.marshruber.marshruberserver.respositories.RiderRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rider")
public class RiderController {

    private final RiderRepository riderRepository;

    public RiderController(RiderRepository riderRepository) {
        this.riderRepository = riderRepository;
    }

    @GetMapping("/")
    public List<Rider> getAll() {
        return (List<Rider>) riderRepository.findAll();
    }
}
