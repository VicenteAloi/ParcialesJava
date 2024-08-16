package ejercicio1;

import java.util.LinkedList;

public class Catering extends Event{
    private double fixedCost;
    private LinkedList<Menu> menus = new LinkedList<>();

    public double getFixedCost() {
        return fixedCost;
    }

    public void setFixedCost(double fixedCost) {
        this.fixedCost = fixedCost;
    }

    public LinkedList<Menu> getMenus() {
        return menus;
    }

    public void setMenus(LinkedList<Menu> menus) {
        this.menus = menus;
    }

//    @Override
//    public double getCost(){
//        double menuCosts=0;
//        for (Menu menu : menus){
//            menuCosts+= menu.getUniCost()*menu.getQuantity();
//        }
//        return getFixedCost()+menuCosts;
//    }

    @Override
    public double getOveralCost(){
        double serviceCost = super.getOveralCost();
        double menuCosts=0;
        for (Menu menu : menus){
            menuCosts+= menu.getUniCost()*menu.getQuantity();
        }
        return getFixedCost()+menuCosts+serviceCost;
    }
}
