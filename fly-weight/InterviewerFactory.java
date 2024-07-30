import java.util.HashMap;


public class InterviewerFactory {
    private static final HashMap<String, Interviewer> hashMap = new HashMap<>();

    public static Interviewer getInterviewer(String name) {
        Interviewer interviewer = hashMap.get(name);
        if (interviewer != null) {
            return interviewer;
        }

        interviewer = new Interviewer(name);
        hashMap.put(name, interviewer);
        return interviewer;
    }
}