package Models;

import java.util.Random;

public final class Address {

    private final Double longitude;
    private final Double latitude;
    private String name;

    public Address(String name) {
        this.name = name;

        Random random = new Random();
        this.latitude = random.nextDouble() * 180 - 90;
        this.longitude = random.nextDouble() * 360 - 180;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double distanceTo(Address address) {
        double latitudinalDifference = this.latitude - address.getLatitude();
        double longitudinalDifference = this.longitude - address.getLongitude();

        return Math.sqrt(Math.pow(latitudinalDifference, 2) + Math.pow(longitudinalDifference, 2));
    }
}