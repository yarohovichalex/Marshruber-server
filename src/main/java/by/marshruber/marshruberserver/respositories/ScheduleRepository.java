package by.marshruber.marshruberserver.respositories;

import by.marshruber.marshruberserver.models.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Long> {

    List<Schedule> findByIdMiniBus(long idMiniBus);

    List<Schedule> findByIdBusStop(long idBusStop);
}
