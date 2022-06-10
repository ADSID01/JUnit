import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFirst {
    @Test
    public void test_PositiveArgument() {
        // given:
        final int arg1 = 50;
        final int arg2 = 25;
        final double expected = 2;

        // when:
        Calculator calc = Calculator.instance.get();
        double result = calc.devide.apply(arg1, arg2);

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test_ZeroArgument() {
        // given:
        final int arg1 = 50;
        final int arg2 = 0;
        final double expected = 0;

        // when:
        Calculator calc = Calculator.instance.get();
        double result = calc.devide.apply(arg1, arg2);

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test_NegativeArgument() {
        // given:
        final int arg1 = 50;
        final int arg2 = -5;
        final double expected = 0;

        // when:
        Calculator calc = Calculator.instance.get();
        double result = calc.devide.apply(arg1, arg2);

        // then:
        Assertions.assertEquals(expected, result);
    }
}
