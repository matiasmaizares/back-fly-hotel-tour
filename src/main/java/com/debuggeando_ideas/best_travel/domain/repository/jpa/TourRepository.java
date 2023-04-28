package com.debuggeando_ideas.best_travel.domain.repository.jpa;

import com.debuggeando_ideas.best_travel.domain.entities.jpa.TourEntity;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<TourEntity,Long> {
}
