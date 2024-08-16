package ejercicio1;

import java.util.LinkedList;

public class Equipement {
    private String type;
    private double cost;
    private LinkedList<Show> shows = new LinkedList<>();


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public LinkedList<Show> getShows() {
        return shows;
    }

    public void setShows(LinkedList<Show> shows) {
        this.shows = shows;
    }
}
