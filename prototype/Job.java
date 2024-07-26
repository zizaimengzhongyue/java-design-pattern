public class Job implements Prototype {
    private String jobDescpriton;

    public Job(String jobDescpriton) {
        this.jobDescpriton = jobDescpriton;
    }

    public String getJobDescription() {
        return this.jobDescpriton;
    }

    public Prototype clone() {
        return new Job(this.jobDescpriton);
    }
}