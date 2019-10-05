package fr.auxietre.spring.service;

import fr.auxietre.spring.domain.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {
    @Autowired
    fr.auxietre.spring.repository.PlaceRepository placeRepository;

    public void addPlace(Place place) {
        placeRepository.save(place);
    }

    public Place findByName(String name) {
        return placeRepository.findByName(name);

    }

    public List<Place> findAllByName(String name) {
        return placeRepository.findAllByName(name);

    }

    public List<Place> findAllByLatitudeBeforeAndLatitudeAfterAndLongitudeBeforeAndLongitudeAfter(float firstLat, float lastLat, float firstLong, float lastLong) {
        return placeRepository.findAllByLatitudeAfterAndLatitudeBeforeAndLongitudeAfterAndLongitudeBefore(firstLat, lastLat, firstLong, lastLong);
    }

    public void deleteByName(String name) {
        placeRepository.deleteByName(name);
    }


}
