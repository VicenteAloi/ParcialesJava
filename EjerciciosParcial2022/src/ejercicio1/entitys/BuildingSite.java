package ejercicio1.entitys;

import java.util.LinkedList;

public class BuildingSite {
    private Integer id;
    private String address;
    private LinkedList<Job> jobs= new LinkedList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LinkedList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(LinkedList<Job> jobs) {
        this.jobs = jobs;
    }

    public double getOveralBudget(){
        double totalCost=0;
        for (Job job : jobs) {
        totalCost += getOveralBudget();
        }
        return totalCost;
    }
}
