package Models.Driver;

public class Driver {
    static private Integer ID = 0;

    private final Integer id;
    private String name;
    private DriverType type;
    private Integer rating;

    public Driver(String name, DriverType type, Integer rating) {
        this.id = ++ID;
        this.name = name;
        this.type = type;
        this.rating = rating;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public DriverType getType() {
        return this.type;
    }

    public Integer getRating() {
        return this.rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(DriverType type) {
        this.type = type;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Double getAverageSpeed() {
        return this.type.getAverageSpeed();
    }

    public void showDriverDetails() {
        System.out.printf("%d. \"%s\" - %s - %d\n", this.id, this.name, this.type.getName(), this.rating);
    }
}