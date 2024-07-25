import java.util.ArrayList;

public class HeadHunter implements Subject {
    private ArrayList<Observer> observers;
    private String jobDescription;

    public HeadHunter() {
        this.observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int index = this.observers.indexOf(observer);
        if (index == -1) {
            return;
        }
        this.observers.remove(index);
    }

    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

    public void change(String jobDescription) {
        this.jobDescription = jobDescription;
        this.notifyObservers();
    }

    public String getMessage() {
        return this.jobDescription;
    }
}