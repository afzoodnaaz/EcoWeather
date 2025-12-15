public class WeatherData {

    private double temperature;
    private double feelsLike;
    private long humidity;
    private double windSpeed;
    private String description;

    public double getTemperature() {

        return temperature;
    }
    public void setTemperature(double temperature) {

        this.temperature = temperature;
    }

    public double getFeelsLike() {

        return feelsLike;
    }
    public void setFeelsLike(double feelsLike) {

        this.feelsLike = feelsLike;
    }

    public long getHumidity() {
        return humidity;
    }
    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }
    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
