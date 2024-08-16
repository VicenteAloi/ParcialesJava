package ejercicio1;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

public class Artist {
    private String name;
    private double hourlyCost;
    private LinkedList<Show> shows = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyCost() {
        return hourlyCost;
    }

    public void setHourlyCost(double hourlyCost) {
        this.hourlyCost = hourlyCost;
    }

    public LinkedList<Show> getShows() {
        return shows;
    }

    public void setShows(LinkedList<Show> shows) {
        this.shows = shows;
    }
}
