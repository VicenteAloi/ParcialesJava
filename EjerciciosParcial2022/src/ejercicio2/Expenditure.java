package ejercicio2;

import java.util.Date;
import java.util.LinkedList;

public class Expenditure {
    private Boolean reimbursable;
    private double amount;
    private Date date;
    private LinkedList<Expenditure> gastos= new LinkedList<Expenditure>();

    public Boolean isReimbursable() {
        return reimbursable;
    }

    public void setReimbursable(Boolean reimbursable) {
        this.reimbursable = reimbursable;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
