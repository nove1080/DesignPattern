package observer.display;

public interface Observer {

    /**
     * parameter: Observer에게 전달되는 상태값
     */
    public void update(float temperature, float humidity, float pressure);

}
