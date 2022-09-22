package hiber.service;

import hiber.model.User;
import hiber.model.Car;

import java.util.List;

public interface UserService {
    void add(User user);
    void addCar(Car car);
    List<User> listUsers();
    List<Car> listCars();
    User getUserFromCar(String model, int series);
}
