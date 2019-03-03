package Sandbox.New.Lambda;
import java.util.Arrays;
import java.util.List;

public class LambdaDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        filter(numbers,x -> x % 2 == 1);
    }
    private static void filter(List<Integer> list, Checker checker){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        for (int num : numbers) {
            if (checker.check(num)) System.out.println(num);
        }
    }
}
