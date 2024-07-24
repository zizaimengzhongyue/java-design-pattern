import interviewer.*;
import job.*;

public class Coder implements Interview {
    public interviewer.Interviewer getInterviewer() {
        return new interviewer.Coder();
    }

    public job.Job getJob() {
        return new job.Coder();
    }
}