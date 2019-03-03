package Sandbox.New.Lambda.Lambdas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter @AllArgsConstructor @ToString
public class Car {

    private final String name;
    private final double price;
    private final int producedIn;

}
