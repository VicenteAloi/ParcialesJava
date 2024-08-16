package ejercicio1.entitys;

public class WorkType {
    private String name;
    private String description;
    private String workUnit;
    private Double quantityRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public Double getQuantityRate() {
        return quantityRate;
    }

    public void setQuantityRate(Double quantityRate) {
        this.quantityRate = quantityRate;
    }
}
