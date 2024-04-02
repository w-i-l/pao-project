package Services;

import Models.Driver.Driver;
import Models.Driver.DriverType;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DriverService {
    private Set<Driver> drivers;

    public DriverService(List<Driver> drivers) {
        this.drivers = new HashSet<Driver>();
        for (Driver driver : drivers) {
            this.drivers.add(driver);
        }
    }

    public DriverService() {
        this.drivers = new HashSet<Driver>();
    }

    public void addDriver(Driver driver) {
        this.drivers.add(driver);
    }

    public void removeDriver(Driver driver) {
        this.drivers.remove(driver);
    }

    public Set<Driver> getDrivers() {
        return this.drivers;
    }

    public void listAllDrivers() {
        for (Driver driver : this.drivers) {
            driver.showDriverDetails();
        }
    }
}