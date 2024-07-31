public class Orginator {
    private Resume resume;
    private Memento memento;

    public Orginator(Resume resume) {
        this.resume = resume;
    }

    public void setMessage(String message) {
        this.resume.setMessage(message);
    }

    public String getMessage() {
        return this.resume.getMessage();
    }

    public void saveToMemento() {
        this.memento = new Memento(this.resume.getMessage());
    }

    public void restoreFromMemento() {
        this.resume.setMessage(this.memento.getMessage());
    }
}