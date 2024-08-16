package ejercicio1.entitys;

public class FixedPriceJob extends Job {
    private Double agreedBudget;

    public Double getAgreedBudget() {
        return agreedBudget;
    }

    public void setAgreedBudget(Double agreedBudget) {
        this.agreedBudget = agreedBudget;
    }

    @Override
    public double getJobCost() {
        return agreedBudget;
    }
}
