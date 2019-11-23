package by.marshruber.marshruberserver.controllers;

import by.marshruber.marshruberserver.models.Route;
import by.marshruber.marshruberserver.respositories.RouteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("route")
public class RouteController {

    private final RouteRepository routeRepository;

    public RouteController(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    @GetMapping("/")
    public List<Route> getAll() {
        return (List<Route>) routeRepository.findAll();
    }
}
