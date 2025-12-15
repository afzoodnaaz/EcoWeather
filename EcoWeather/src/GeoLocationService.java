import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class GeoLocationService {
    public JSONObject getLocationData(String city) {
        city = city.replace(" ", "+");

        String url = "https://geocoding-api.open-meteo.com/v1/search?name=" +
                city + "&count=1&language=en&format=json";

        String json = HttpUtil.get(url);
        JSONObject obj = JsonUtil.parse(json);

        JSONArray results = (JSONArray) obj.get("results");
        return (JSONObject) results.get(0);
    }

    // Required for GUI
    public double[] getUserCoordinates() {
        return new double[]{52.52, 13.4050}; // Berlin default
    }
}
