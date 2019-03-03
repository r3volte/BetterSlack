package Sandbox.New.Lambda.Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
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
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Tesla", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Ferrari", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Tesla", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Ferrari", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Ferrari", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Tesla", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Tesla", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Ferrari", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Tesla", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Ferrari", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Ferrari", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Tesla", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Fiat", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020)),
                new Car("Mercedes", (random.nextDouble() * 1000000) + 1000, ThreadLocalRandom.current().nextInt(1967, 2020))
        );
    }
    public void applyFilter(Predicate<Car> filter){
        displayedCars = originalList.stream()
                .filter(filter)
                .collect(Collectors.toList());
        availableCars = (int) originalList.stream().filter(filter).count();

        System.out.println("Search results: " + availableCars);
        displayedCars
                .forEach(car -> System.out.println(car));


    }
}

