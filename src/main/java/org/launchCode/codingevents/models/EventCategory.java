package org.launchCode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class EventCategory extends AbstractEntity {


    @Size(min=3, message="Name must be at least 3 characters long")
    private String name;

    @OneToMany(mappedBy = "eventCategory")
    private final List<Event> events = new ArrayList<>();

    public EventCategory(String name) {
        this.name = name;
    }

    public EventCategory() { }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setId(int id) {
        this.setId(id);
    }

    @Override
    public String toString() {
        return name;
    }

}
