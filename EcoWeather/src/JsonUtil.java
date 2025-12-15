import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtil {

    public static JSONObject parse(String json) {
        try {
            JSONParser parser = new JSONParser();
            return (JSONObject) parser.parse(json);
        } catch (Exception e) {
            throw new RuntimeException("JSON Parsing Error");
        }
    }
}
