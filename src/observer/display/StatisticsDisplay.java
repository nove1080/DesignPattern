package observer.display;

import observer.weather.WeatherData;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
    private List<Float> temperatures;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        temperatures = new ArrayList<>();
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatures.add(temperature);
        display();
    }

    @Override
    public void display() {
        double average = temperatures.stream()
                .mapToDouble(f -> f)
                .average()
                .getAsDouble();
        Float min = temperatures.stream().min(Comparator.naturalOrder()).get();
        Float max = temperatures.stream().max(Comparator.naturalOrder()).get();
        System.out.printf("평균/최고/최저 온도 = %.1f/%.1f/%.1f\n", average, min, max);
    }
}
