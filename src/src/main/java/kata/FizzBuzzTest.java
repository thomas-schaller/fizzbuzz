package kata;


import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    /**
     * Lorsque il y a 1 en entrée, la fonction renvoie 1
     */
    @Test
    public void convertAvec1()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
         Assert.assertEquals(1, fizzBuzz.convert(1));
    }

    @Test
    public void convertAvec2()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(2, fizzBuzz.convert(2));
    }
}