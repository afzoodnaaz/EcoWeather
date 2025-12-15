import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class HttpUtil {
    public static String get(String urlString) {
        try {
            URL url = new URL(urlString);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            Scanner sc = new Scanner(conn.getInputStream());
            StringBuilder result = new StringBuilder();

            while (sc.hasNext()) result.append(sc.nextLine());
            sc.close();

            return result.toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
