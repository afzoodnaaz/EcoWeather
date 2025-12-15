
import javax.swing.*;
import java.awt.*;

public class WeatherAppGUI extends JFrame {

    private WeatherService weatherService;

    public WeatherAppGUI(WeatherService ws) {
        this.weatherService = ws;

        setTitle("Crocodile Habitat Weather App");
        setSize(700, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(200, 255, 200));

        JTabbedPane tabbedPane = new JTabbedPane();

        // City Weather
        JPanel cityPanel = new JPanel();
        cityPanel.setBackground(new Color(200, 255, 200));
        cityPanel.setLayout(new GridBagLayout());
        addCityComponents(cityPanel);
        tabbedPane.addTab("City Weather", cityPanel);

        // Habitat Weather
        JPanel habitatPanel = new JPanel();
        habitatPanel.setBackground(new Color(200, 255, 200));
        habitatPanel.setLayout(new GridBagLayout());
        addHabitatComponents(habitatPanel);
        tabbedPane.addTab("Habitat Weather", habitatPanel);

        add(tabbedPane);
    }

    private void addCityComponents(JPanel panel) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        JLabel cityLabel = new JLabel("Enter City:");
        panel.add(cityLabel, gbc);

        gbc.gridx = 1;
        JTextField cityField = new JTextField(15);
        panel.add(cityField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        JButton cityButton = new JButton("Get City Weather");
        cityButton.setBackground(new Color(150, 220, 150));
        panel.add(cityButton, gbc);

        gbc.gridy = 2;
        JTextArea output = new JTextArea(12, 40);
        output.setEditable(false);
        output.setLineWrap(true);
        output.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(output);
        panel.add(scroll, gbc);

        cityButton.addActionListener(e -> {
            try {
                String city = cityField.getText();
                WeatherData weather = weatherService.getWeatherByCity(city);

                output.setText(
                        "City: " + city + "\n\n" +
                                "Temperature: " + weather.getTemperature() + "°C\n" +
                                "Humidity: " + weather.getHumidity() + "%\n" +
                                "Wind Speed: " + weather.getWindSpeed() + " m/s"
                );
            } catch (Exception ex) {
                output.setText("Error fetching city weather.");
            }
        });
    }

    private void addHabitatComponents(JPanel panel) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        JLabel habitatLabel = new JLabel("Select Habitat:");
        panel.add(habitatLabel, gbc);

        gbc.gridx = 1;
        JComboBox<String> habitatList = new JComboBox<>(HabitatData.Habitat_names);
        panel.add(habitatList, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        JButton habitatButton = new JButton("Get Habitat Weather");
        habitatButton.setBackground(new Color(150, 220, 150));
        panel.add(habitatButton, gbc);

        gbc.gridy = 2;
        JTextArea output = new JTextArea(12, 40);
        output.setEditable(false);
        output.setLineWrap(true);
        output.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(output);
        panel.add(scroll, gbc);

        habitatButton.addActionListener(e -> {
            try {
                String habitat = (String) habitatList.getSelectedItem();
                double[] coords = HabitatData.Habitat_coordinates.get(habitat);
                String description = HabitatData.Habitat_descriptions.get(habitat);
                WeatherData weather = weatherService.getWeatherByCoords(coords[0], coords[1]);

                output.setText(
                        "Habitat: " + habitat + "\n" +
                                "Description: " + description + "\n" +
                                "Coordinates: " + coords[0] + ", " + coords[1] + "\n\n" +
                                "Temperature: " + weather.getTemperature() + "°C\n" +
                                "Humidity: " + weather.getHumidity() + "%\n" +
                                "Wind Speed: " + weather.getWindSpeed() + " m/s"
                );
            } catch (Exception ex) {
                output.setText("Error fetching habitat weather.");
            }
        });
    }
}
