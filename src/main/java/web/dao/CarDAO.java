package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> car;

    {
        car = new ArrayList<>();

        car.add(new Car(1, "Lada"));
        car.add(new Car(2, "VAZ"));
        car.add(new Car(3, "BMW"));
        car.add(new Car(4, "MAN"));
    }

    public List<Car> index() {
        return car;
    }

    public Car show(int id) {
        return car.stream().filter(car -> car.getId() == id).findAny().orElse(null);
    }
}
