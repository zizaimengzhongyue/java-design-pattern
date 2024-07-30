public interface Interviewer {
    public void selfIntroduction();
    public void interview(int num);
    public Interviewer setNextRound(Interviewer interviewer);
}