import javax.swing.SwingUtilities;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        WeatherService ws = new WeatherService();
        GeoLocationService gs = new GeoLocationService();
        HabitatWeatherService hs = new HabitatWeatherService(ws);


        WeatherAppGUI app = new WeatherAppGUI(ws);
        app.setVisible(true);
    }
}
