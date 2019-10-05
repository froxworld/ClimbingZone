package fr.auxietre.spring.repository;

import fr.auxietre.spring.domain.Climber;
import org.springframework.data.repository.CrudRepository;

//sert a dialoguer avec la base de donnee
public interface ClimberRepository extends CrudRepository<Climber, Long> {
    void deleteAll();
}

