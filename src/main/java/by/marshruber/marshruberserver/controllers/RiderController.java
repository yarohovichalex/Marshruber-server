package by.marshruber.marshruberserver.controllers;

import by.marshruber.marshruberserver.models.Rider;
import by.marshruber.marshruberserver.respositories.RiderRepository;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    public Rider updateRider(@RequestBody Rider rider) {
        return riderRepository.save(rider);
    }
}
