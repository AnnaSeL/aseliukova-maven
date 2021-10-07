import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {
    @Test
     public void test_sum_normal_case(){
        Assertions.assertEquals(4,Calculator.sum(3,1));
    }

    @Test
    public void test_division_by_zero(){
        Assertions.assertThrows(ArithmeticException.class,()-> Calculator.div(5,0));
    }
}
