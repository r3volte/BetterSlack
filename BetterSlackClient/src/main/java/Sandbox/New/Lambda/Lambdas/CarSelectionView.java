package Sandbox.New.Lambda.Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarSelectionView {

    private List<Car> displayedCars;
    private List<Car> originalList;
    private int availableCars;


    public CarSelectionView(){
        displayedCars = new ArrayList<>();
        Random random = new Random();
        originalList = Arrays.asList(
                new Car("Mercedes",(random.nextDouble() * 100000) + 1000,random.nextInt()),
                new Car("Audi",(random.nextDouble() * 100000) + 1000,random.nextInt()),
                new Car("BMW",(random.nextDouble() * 100000) + 1000,random.nextInt()),
                new Car("Seat",(random.nextDouble() * 100000) + 1000,random.nextInt()),
                new Car("Fiat",(random.nextDouble() * 100000) + 1000,random.nextInt()),
                new Car("Tesla",(random.nextDouble() * 100000) + 1000,random.nextInt()),
                new Car("KIA",(random.nextDouble() * 100000) + 1000,random.nextInt()),
                new Car("Skoda",(random.nextDouble() * 100000) + 1000,random.nextInt()),
                new Car("Opel",(random.nextDouble() * 100000) + 1000,random.nextInt()),
                new Car("Alfa Romeo",(random.nextDouble() * 100000) + 1000,random.nextInt()),
                new Car("Honda",(random.nextDouble() * 100000) + 1000,random.nextInt()),
                new Car("Nissan",(random.nextDouble() * 100000) + 1000,random.nextInt()),
                new Car("Mazda",(random.nextDouble() * 100000) + 1000,random.nextInt()),
                new Car("Volvo",(random.nextDouble() * 100000) + 1000,random.nextInt())
        );
    }
    public void applyFilter(Predicate<Car> filter){
        displayedCars = originalList.stream()
                .filter(filter)
                .collect(Collectors.toList());
        long availableCars = originalList.stream().filter(filter).count();

        System.out.println("Search results: " + availableCars);
        displayedCars
                .forEach(car -> System.out.println(car));


    }
}

