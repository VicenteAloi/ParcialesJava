package ejercicio1.entitys;

public class HourlyRatedJob extends Job {
    private Contratist contratist;

    public Contratist getContratist() {
        return contratist;
    }

    public void setContratist(Contratist contratist) {
        this.contratist = contratist;
    }

    @Override
    public double getJobCost() {
        double hourlyRatedJob =0;
        hourlyRatedJob = contratist.getHourlyRate() * getEstimatedHours();
        return hourlyRatedJob;
    }
}
