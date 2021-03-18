package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{


    @Override
    public List<Car> getAllCars(int number) {

        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Niva", 123, 2007));
        carsList.add(new Car("Lada", 456, 1995));
        carsList.add(new Car("Pejo", 789, 2019));
        carsList.add(new Car("Nissan", 222, 2010));
        carsList.add(new Car("Kia", 131, 2017));

        return carsList.subList(0, number);
    }
}
