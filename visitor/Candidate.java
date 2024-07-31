public interface Candidate {

    public void accept(Visitor visitor);
    public String getName();
    public String getMessage();

}