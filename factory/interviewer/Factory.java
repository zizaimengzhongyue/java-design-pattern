package interviewer;

public class Factory {
    public static Interviewer getInterviewer(String carrer) {
        if (carrer == "sales") {
            return new Sales();
        }
        return new Coder();
    }
}