import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzConverterTest {

    @Test
    public void fizzBuzzConverterForNormalNumbers() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("1", fizzBuzzConverter.convert(1));
        Assert.assertEquals("2", fizzBuzzConverter.convert(2));
    }

    @Test
    public void fizzBuzzConverterForMultipleofThree() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("Fizz", fizzBuzzConverter.convert(3));
        Assert.assertEquals("Fizz", fizzBuzzConverter.convert(6));
    }

    @Test
    public void fizzBuzzConverterForMultipleofFive() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("Buzz", fizzBuzzConverter.convert(5));
        Assert.assertEquals("Buzz", fizzBuzzConverter.convert(10));
    }

    @Test
    public void fizzBuzzConverterForMultipleofThreeAndFive() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.convert(15));
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.convert(30));
    }
}