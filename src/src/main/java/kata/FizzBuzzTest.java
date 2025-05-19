package kata;


import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    /**
     * Lorsque il y a 1 en entrée, la fonction renvoie 1
     */
    @Test
    public void shouldBeNumber()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
         Assert.assertEquals("1", fizzBuzz.convert(1));
    }


    @Test
    public void shouldFizz()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(FizzBuzz.FIZZ, fizzBuzz.convert(6));
    }

    @Test
    public void shouldBuzz()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(FizzBuzz.BUZZ, fizzBuzz.convert(10));
    }

    @Test
    public void shouldFizzBuzz()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(FizzBuzz.FIZZ + FizzBuzz.BUZZ, fizzBuzz.convert(15));
    }
    @Test
    public void shouldBe0()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("0", fizzBuzz.convert(0));
    }

    @Test
    public void shouldFizzBecause3()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(FizzBuzz.FIZZ, fizzBuzz.convert(31));
    }


}