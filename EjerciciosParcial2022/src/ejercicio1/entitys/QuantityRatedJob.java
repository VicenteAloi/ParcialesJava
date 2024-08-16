package ejercicio1.entitys;

public class QuantityRatedJob extends Job {
    private Double quantity;

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getJobCost(){
        return super.getWorktype().getQuantityRate() * this.getQuantity();
    }
}
