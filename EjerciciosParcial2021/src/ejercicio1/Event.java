package ejercicio1;

import java.time.LocalDateTime;
import java.util.LinkedList;

public abstract class Event {
    private LocalDateTime eventDate;
    private String location;
    private LinkedList<Service> services = new LinkedList<>();
    private Client client;

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LinkedList<Service> getServices() {
        return services;
    }

    public void setServices(LinkedList<Service> services) {
        this.services = services;
    }

//    abstract double getCost();

    public double getOveralCost(){
        double totalCost=0;
        for (Service service : services) {
            totalCost += service.getCost();
        }
        return totalCost;
    }
}
