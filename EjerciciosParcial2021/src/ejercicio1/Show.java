package ejercicio1;

import java.util.Arrays;

public class Show extends Event{
    private String type;
    private String name;
    private double durationHs;
    private Equipement equipement;
    private Artist artist;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDurationHs() {
        return durationHs;
    }

    public void setDurationHs(double durationHs) {
        this.durationHs = durationHs;
    }

//    @Override
//    double getCost() {
//        return equipement.getCost()+(artist.getHourlyCost()*getDurationHs());
//    }

    @Override
    public double getOveralCost() {
        double serviceCost = super.getOveralCost();
        double showCost = equipement.getCost() + (artist.getHourlyCost() * getDurationHs());
        return serviceCost + showCost;
    }
}
