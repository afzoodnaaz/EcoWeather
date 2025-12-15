public class Habitat extends HabitatData{
    protected String hname;
    protected String climate;
    protected String description;
    protected String region;

    public Habitat(String hname, String climate, String description, String region) {
        this.hname = hname;
        this.climate = climate;
        this.description = description;
        this.region = region;
    }

    public Habitat(String hname1) {
        this.hname = hname1;
    }

    public String getHabitatInfo() {
        return "Habitat: " + hname + "\nClimate: " + climate + "\nRegion: " + region + "\nDescription: " + description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return hname;
    }


}
