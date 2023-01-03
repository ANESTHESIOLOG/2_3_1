package web.model;

import java.util.Objects;

public class Car {
    private int id;
    private String name;
    private String model;

    public Car(int id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && name.equals(car.name) && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, model);
    }
}
