import interviewer.*;
import job.*;

public class Sales implements Interview {
    public interviewer.Interviewer getInterviewer() {
        return new interviewer.Sales();
    }

    public job.Job getJob() {
        return new job.Sales();
    }
}