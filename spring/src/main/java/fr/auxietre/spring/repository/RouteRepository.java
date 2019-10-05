package fr.auxietre.spring.repository;

import fr.auxietre.spring.domain.Parking;
import fr.auxietre.spring.domain.Route;
import fr.auxietre.spring.domain.RouteType;
import fr.auxietre.spring.domain.ZoneType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RouteRepository extends CrudRepository<Route, Long> {
    List<Route> findAllByName(String name);
    List<Route> findAllByLatitudeAfterAndLatitudeBeforeAndLongitudeAfterAndLongitudeBefore(float firstLat, float lastLat, float firstLong, float lastLong);
    List<Parking> findAllByParking(Route parking);
    List<Route> findAllByRouteType(RouteType routeType);
    List<Route> findAllByZoneType(ZoneType zoneType);
    void deleteByName(String name);

}
