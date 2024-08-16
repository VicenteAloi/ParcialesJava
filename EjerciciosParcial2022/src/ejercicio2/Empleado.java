package ejercicio2;

import java.util.LinkedList;

public class Empleado {

    private LinkedList<Expenditure> expenditures = new LinkedList<>();
    private double reimbursementPorcentage;


    public double getReimbursement(LinkedList<Expenditure> expenditures, double reimbursementPorcentage){
        double gastosTotales=0;
        for(Expenditure expenditure : expenditures){
            if(expenditure.isReimbursable()){
                gastosTotales += expenditure.getAmount();
            }
        }
        return gastosTotales*reimbursementPorcentage;
    }
}
