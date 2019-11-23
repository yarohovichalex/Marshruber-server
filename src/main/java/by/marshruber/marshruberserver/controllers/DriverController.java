package by.marshruber.marshruberserver.controllers;

import by.marshruber.marshruberserver.models.Driver;
import by.marshruber.marshruberserver.respositories.DriverRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("driver")
public class DriverController {

    private final DriverRepository driverRepository;

    public DriverController(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @GetMapping("/{driverId}")
    public Optional<Driver> getDriverById(@PathVariable Long driverId) {
        return driverRepository.findById((Long) driverId);
    }
}
