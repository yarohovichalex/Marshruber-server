package by.marshruber.marshruberserver.controllers;

import by.marshruber.marshruberserver.models.Driver;
import by.marshruber.marshruberserver.models.Rider;
import by.marshruber.marshruberserver.models.Route;
import by.marshruber.marshruberserver.respositories.DriverRepository;
import by.marshruber.marshruberserver.respositories.RiderRepository;
import by.marshruber.marshruberserver.respositories.RouteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("route")
public class RouteController {

    private final RouteRepository routeRepository;
    private final DriverRepository driverRepository;
    private final RiderRepository riderRepository;

    public RouteController(RouteRepository routeRepository, DriverRepository driverRepository, RiderRepository riderRepository) {
        this.routeRepository = routeRepository;
        this.driverRepository = driverRepository;
        this.riderRepository = riderRepository;
    }

    @GetMapping("/")
    public List<Route> getAll() {
        return (List<Route>) routeRepository.findAll();
    }

    @GetMapping("/{routeId}/drivers")
    public List<Driver> getAllDriversForRoute(@PathVariable Long routeId) {
        return driverRepository.findByRouteId(routeId);
    }

    @GetMapping("/{routeId}/riders")
    public List<Rider> getAllRidersForRoute(@PathVariable Long routeId) {
        return riderRepository.findByRouteId(routeId);
    }
}
