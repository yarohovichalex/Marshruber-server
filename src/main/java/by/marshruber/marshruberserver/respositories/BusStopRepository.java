package by.marshruber.marshruberserver.respositories;

import by.marshruber.marshruberserver.models.BusStop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusStopRepository extends CrudRepository<BusStop, Long> {

    BusStop findById(long id);

    List<BusStop> findAll();
}
