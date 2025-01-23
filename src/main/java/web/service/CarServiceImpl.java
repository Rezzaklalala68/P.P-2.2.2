package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;
    public CarServiceImpl()
    {
        cars = new ArrayList<>();
        cars.add(new Car( "BMW", "Anton")) ;
        cars.add(new Car( "Kia", "Pavel")) ;
        cars.add(new Car( "Mercedes", "Yuri")) ;
        cars.add(new Car( "Lada", "Andrei")) ;
        cars.add(new Car( "Porsche", "Nursultan")) ;

    }
    @Override
    public List<Car> getSomeCars(int count) {
        if(count>=5){
            return cars;
        }
        return cars.subList(0,count);

    }
}
