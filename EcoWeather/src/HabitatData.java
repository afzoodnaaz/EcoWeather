//import java.util.HashMap;
//
//public class HabitatData {
//
//    public static final HashMap<String, double[]> Habitat_coordinates = new HashMap<>();
//
//    public static final String[] Habitat_names = {
//            "Nile River (Africa)",
//            "Queensland (Australia)",
//            "Florida Everglades (USA)",
//            "Orinoco Basin (South America)",
//            "Southeast Asia Mangroves"
//    };
//
//    static {
//        Habitat_coordinates.put("Nile River (Africa)", new double[]{30.0444, 31.2357});
//        Habitat_coordinates.put("Queensland (Australia)", new double[]{-19.2576, 146.8179});
//        Habitat_coordinates.put("Florida Everglades (USA)", new double[]{25.2866, -80.8987});
//        Habitat_coordinates.put("Orinoco Basin (South America)", new double[]{4.0, -67.0});
//        Habitat_coordinates.put("Southeast Asia Mangroves", new double[]{1.3521, 103.8198});
//    }
//}
//

import java.util.HashMap;

public class HabitatData {

    public static final String[] Habitat_names = {
            "Nile River (Africa)",
            "Queensland (Australia)",
            "Florida Everglades (USA)",
            "Orinoco Basin (South America)",
            "Southeast Asia Mangroves",
            "Okavango Delta (Botswana)",
            "Ganges River (India)",
            "Mekong Delta (Vietnam)",
            "Cameroon Wetlands (Cameroon)",
            "Lake Argyle (Australia)",
            "Everglades National Park (USA)",
            "Amazon Basin (South America)",
            "Indus River (Pakistan)",
            "Yangtze River (China)",
            "Madagascar Wetlands (Madagascar)"
    };

    public static final HashMap<String, double[]> Habitat_coordinates = new HashMap<>();
    public static final HashMap<String, String> Habitat_descriptions = new HashMap<>();

    static {
        Habitat_coordinates.put("Nile River (Africa)", new double[]{30.0444, 31.2357});
        Habitat_coordinates.put("Queensland (Australia)", new double[]{-19.2576, 146.8179});
        Habitat_coordinates.put("Florida Everglades (USA)", new double[]{25.2866, -80.8987});
        Habitat_coordinates.put("Orinoco Basin (South America)", new double[]{4.0, -67.0});
        Habitat_coordinates.put("Southeast Asia Mangroves", new double[]{1.3521, 103.8198});
        Habitat_coordinates.put("Okavango Delta (Botswana)", new double[]{-19.1333, 23.5833});
        Habitat_coordinates.put("Ganges River (India)", new double[]{25.5941, 85.1376});
        Habitat_coordinates.put("Mekong Delta (Vietnam)", new double[]{10.0333, 105.7833});
        Habitat_coordinates.put("Cameroon Wetlands (Cameroon)", new double[]{4.0, 12.0});
        Habitat_coordinates.put("Lake Argyle (Australia)", new double[]{-15.3833, 128.7333});
        Habitat_coordinates.put("Everglades National Park (USA)", new double[]{25.2866, -80.8987});
        Habitat_coordinates.put("Amazon Basin (South America)", new double[]{-3.4653, -62.2159});
        Habitat_coordinates.put("Indus River (Pakistan)", new double[]{30.1575, 71.5249});
        Habitat_coordinates.put("Yangtze River (China)", new double[]{31.2304, 121.4737});
        Habitat_coordinates.put("Madagascar Wetlands (Madagascar)", new double[]{-18.7669, 46.8691});

        Habitat_descriptions.put("Nile River (Africa)", "The Nile River is the longest river in Africa.");
        Habitat_descriptions.put("Queensland (Australia)", "Queensland habitats contain saltwater and freshwater crocodiles.");
        Habitat_descriptions.put("Florida Everglades (USA)", "A vast wetland in Florida home to the American crocodile.");
        Habitat_descriptions.put("Orinoco Basin (South America)", "Home to the Orinoco crocodile in freshwater rivers and wetlands.");
        Habitat_descriptions.put("Southeast Asia Mangroves", "Mangrove ecosystems provide shelter for saltwater crocodiles.");
        Habitat_descriptions.put("Okavango Delta (Botswana)", "A unique inland delta with freshwater crocodiles.");
        Habitat_descriptions.put("Ganges River (India)", "Crocodiles inhabit the Ganges river system.");
        Habitat_descriptions.put("Mekong Delta (Vietnam)", "Rich wetland region supporting crocodile populations.");
        Habitat_descriptions.put("Cameroon Wetlands (Cameroon)", "Freshwater wetlands in Cameroon are habitats for crocodiles.");
        Habitat_descriptions.put("Lake Argyle (Australia)", "Largest artificial lake in Australia with freshwater crocodiles.");
        Habitat_descriptions.put("Everglades National Park (USA)", "Protected wetland area for American crocodiles...");
        Habitat_descriptions.put("Amazon Basin (South America)", "Dense rainforest with rivers inhabited by spectacled caiman.");
        Habitat_descriptions.put("Indus River (Pakistan)", "Indus river system supports freshwater crocodiles.");
        Habitat_descriptions.put("Yangtze River (China)", "Rare Chinese alligator inhabits Yangtze wetlands.");
        Habitat_descriptions.put("Madagascar Wetlands (Madagascar)", "Isolated wetlands home to Madagascar crocodiles.");
    }
}
