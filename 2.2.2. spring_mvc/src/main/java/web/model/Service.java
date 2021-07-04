package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Service {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "1231", 1995));
        carList.add(new Car("Audio", "1214", 2000));
        carList.add(new Car("volvo", "6666", 2008));
        carList.add(new Car("Porsche", "7777", 2018));
        carList.add(new Car("BMW", "b2122", 2020));
    }

    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
