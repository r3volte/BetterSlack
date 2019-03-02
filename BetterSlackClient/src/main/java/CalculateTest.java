import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateTest {

    private Calculate calculate;

@Test
    public void testMethodAddingTwoNumbers(){

        //given

        calculate = new Calculate();

        //when

        int result = calculate.addingTwoNumbers(3,3);

        //then

        assertEquals(6,result);
    }
}
