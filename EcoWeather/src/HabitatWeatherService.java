public class HabitatWeatherService {

    private WeatherService weatherService;

    public HabitatWeatherService(WeatherService ws) {
        this.weatherService = ws;
    }

    public HabitatWeatherData getWeatherForHabitat(String habitat) {
        double[] coords = HabitatData.Habitat_coordinates.get(habitat);

        WeatherData w = weatherService.getWeatherByCoords(coords[0], coords[1]);

        HabitatWeatherData data = new HabitatWeatherData();
        data.setHabitatName(habitat);
        data.setWeather(w);

        return data;
    }
}
