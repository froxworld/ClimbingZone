package fr.auxietre.spring.repository;
import fr.auxietre.spring.domain.Parking;
import fr.auxietre.spring.domain.Route;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ParkingRepository extends CrudRepository<Parking, Long> {

    Parking findByName (String name);
    List<Parking> findAllByLatitudeAfterAndLatitudeBeforeAndLongitudeAfterAndLongitudeBefore(float firstLat, float lastLat, float firstLong, float lastLong);
    List<Parking> findByRouteList(Route route);
    void deleteParkingByName(String name);

}
