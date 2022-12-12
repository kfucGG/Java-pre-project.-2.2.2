package web.repository;


import org.springframework.stereotype.Repository;
import web.entity.Car;

import java.util.List;

@Repository
public class CarRepository {

    public List<Car> findAll() {
        Car car1 = new Car("test", 1, "test");
        Car car2 = new Car("test", 1, "test");
        Car car3 = new Car("test", 1, "test");
        Car car4 = new Car("test", 1, "test");
        Car car5 = new Car("test", 1, "test");

        return List.of(car1, car2, car3, car4, car5);
    }
}
