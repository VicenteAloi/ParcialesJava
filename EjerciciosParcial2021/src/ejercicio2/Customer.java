package ejercicio2;

import java.util.LinkedList;

public class Customer {
    private LinkedList<BillItem> billItems = new LinkedList<>();
    private boolean includeTax;

    public double getTotal(LinkedList<BillItem> billItems, boolean includeTax){
        double totalCost=0;
        for(BillItem billItem : billItems){
            totalCost += billItem.getUnitPrice()*billItem.getQuantity();
        }
        if(includeTax){
            totalCost = totalCost*1.21;
        }
        return totalCost;
    }
}

