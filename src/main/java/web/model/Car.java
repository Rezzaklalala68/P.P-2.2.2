package web.model;

import java.util.Objects;
import java.util.UUID;

public class Car {
    private final UUID id = UUID.randomUUID();
    private String brand;
    private String driver;

    public Car() {}
    public Car( String brand, String driver) {
        this.brand = brand;
        this.driver = driver;
    }

    public UUID getId() {return id;}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(brand, car.brand) && Objects.equals(driver, car.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, driver);
    }

    @Override
    public String toString() {
        return "Car: " +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", driver='" + driver + '\'' +
                '}';
    }
}
