package by.marshruber.marshruberserver.respositories;

import by.marshruber.marshruberserver.models.Rider;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RiderRepository extends CrudRepository<Rider, Long> {

    @Query("SELECT r FROM Rider r WHERE r.routeId = ?1")
    List<Rider> findByRouteId(Long routeId);
}
