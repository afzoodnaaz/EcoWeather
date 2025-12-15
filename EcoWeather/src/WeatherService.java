import org.json.simple.JSONObject;

public class WeatherService {

    private final GeoLocationService geoService = new GeoLocationService();

    public WeatherData getWeatherByCity(String city) {
        JSONObject loc = geoService.getLocationData(city);

        double lat = (double) loc.get("latitude");
        double lon = (double) loc.get("longitude");

        return getWeatherByCoords(lat, lon);
    }

    public WeatherData getWeatherByCoords(double lat, double lon) {
        String url = "https://api.open-meteo.com/v1/forecast?latitude=" + lat +
                "&longitude=" + lon +
                "&current=temperature_2m,relative_humidity_2m,wind_speed_10m";

        String json = HttpUtil.get(url);
        JSONObject obj = JsonUtil.parse(json);
        JSONObject current = (JSONObject) obj.get("current");

        WeatherData data = new WeatherData();
        data.setTemperature((double) current.get("temperature_2m"));
        data.setHumidity((long) current.get("relative_humidity_2m"));
        data.setWindSpeed((double) current.get("wind_speed_10m"));
        data.setFeelsLike(data.getTemperature());
        data.setDescription("Wind/Temp/Humidity");

        return data;
    }
}
