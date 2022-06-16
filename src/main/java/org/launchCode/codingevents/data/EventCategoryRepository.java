package org.launchCode.codingevents.data;

import org.launchCode.codingevents.models.EventCategory;
import org.springframework.data.repository.CrudRepository;

public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {
}
