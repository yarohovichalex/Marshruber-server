package by.marshruber.marshruberserver.services;

import by.marshruber.marshruberserver.models.MiniBus;
import by.marshruber.marshruberserver.respositories.MiniBusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MinibusService {

    @Autowired
    MiniBusRepository miniBusRepository;

    public List<MiniBus> getAllMiniBuses(){
        return miniBusRepository.findAll();
    }
}
