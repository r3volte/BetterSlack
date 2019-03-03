package Sandbox.New.Lambda.Lambdas;

public class CarDemo {

    public static void main(String[] args) {

        CarSelectionView carSelectionView = new CarSelectionView();

        carSelectionView.applyFilter(num -> num.getPrice() > 80000);

    }
}
