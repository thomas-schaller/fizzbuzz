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
         Assert.assertEquals("1", fizzBuzz.convert(1));
    }


    @Test
    public void shouldFizz()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("fizz", fizzBuzz.convert(6));
    }

    @Test
    public void shouldBuzz()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("buzz", fizzBuzz.convert(5));
    }

    @Test
    public void shouldBuzz10()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("buzz", fizzBuzz.convert(10));
    }

    @Test
    public void shouldBeNumber()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("0", fizzBuzz.convert(0));
    }

}