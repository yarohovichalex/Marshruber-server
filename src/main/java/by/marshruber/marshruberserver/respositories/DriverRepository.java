package by.marshruber.marshruberserver.respositories;

import by.marshruber.marshruberserver.models.Driver;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DriverRepository extends CrudRepository<Driver, Long> {

    @Query("SELECT d FROM Driver d WHERE d.routeId = ?1")
    List<Driver> findByRouteId(Long routeId);
}
