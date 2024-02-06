package observer.weather;


import observer.display.Observer;

public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    /**
     * Subject의 상태가 변경되었을 때, 등록된 Observer들에게 알린다.
     */
    public void notifyObservers();

}
