package ejercicio1;

import java.util.LinkedList;

public class Menu {
    private String name;
    private double uniCost;
    private Integer quantity;
    private LinkedList<Catering> caterings = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUniCost() {
        return uniCost;
    }

    public void setUniCost(double uniCost) {
        this.uniCost = uniCost;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LinkedList<Catering> getCaterings() {
        return caterings;
    }

    public void setCaterings(LinkedList<Catering> caterings) {
        this.caterings = caterings;
    }
}
