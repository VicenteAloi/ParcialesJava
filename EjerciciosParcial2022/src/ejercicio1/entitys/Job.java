package ejercicio1.entitys;

public abstract class Job {
    private Integer id;
    private String name;
    private String description;
    private double estimatedHours;
    private double insuranceCost;
    private WorkType worktype;
    private BuildingSite buildingSite;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public double getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(double estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(double insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public WorkType getWorktype() {
        return worktype;
    }

    public void setWorktype(WorkType worktype) {
        this.worktype = worktype;
    }

    public BuildingSite getBuildingSite() {
        return buildingSite;
    }

    public void setBuildingSite(BuildingSite buildingSite) {
        this.buildingSite = buildingSite;
    }

    abstract double getJobCost();

    public double getOveralJobCost(){
        double totalJobCost=0;
        totalJobCost = this.getJobCost() + this.getInsuranceCost();
        return totalJobCost;
    }
}
