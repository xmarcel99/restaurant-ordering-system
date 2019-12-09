package restaurant.menu;

public class Country {

    private int id;
    private String countryName;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public Country(int id, String countryName) {
        this.id = id;
        this.countryName = countryName;
    }

    public int getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setId(int id) {
        this.id = id;
    }
}
