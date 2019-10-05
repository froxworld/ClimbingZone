package fr.auxietre.spring.service;

import fr.auxietre.spring.domain.Parking;
import fr.auxietre.spring.domain.Route;
import fr.auxietre.spring.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingService {
    @Autowired
    ParkingRepository parkingRepository;

    public Parking findByName(String name) {
        return parkingRepository.findByName(name);
    }

    public List<Parking> findAllByLatitudeAfterAndLatitudeBeforeAndLongitudeAfterAndLongitudeBefore(float firstLat, float lastLat, float firstLong, float lastLong) {
        return parkingRepository.findAllByLatitudeAfterAndLatitudeBeforeAndLongitudeAfterAndLongitudeBefore(firstLat, lastLat, firstLong, lastLong);
    }

    public List<Parking> findAllByRoutesListContaining(Route route) {
        return parkingRepository.findByRouteList(route);
    }

    public void deleteParking(String name){
        parkingRepository.deleteParkingByName(name);

    }



}
