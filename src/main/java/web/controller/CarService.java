package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.entity.Car;
import web.repository.CarRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars(int count) {
        if(count >= 5) {
            return getCars();
        }
        return carRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return carRepository.findAll();
    }
}
