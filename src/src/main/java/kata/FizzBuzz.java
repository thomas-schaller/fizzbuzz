package kata;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static final String FIZZ ="Fizz";
    public static final String BUZZ="Buzz";
    public static void main(String [] args){
        FizzBuzz fizzBuzz = new FizzBuzz();
        IntStream.range(0,100).forEach(a -> System.out.println(fizzBuzz.convert(a)));
    }

    /**
     * fonction qui en fonction du paramètre renvoie:
     * - fizz si le nombre en paramètre est divisible par 3,
     * - buzz si le nombre est divisible par 5
     * - fizz si le nombre contient un 3
     * - buzz si le nombre contient un 5
     * - le nombre en paramètre dans les autres cas
     * @param nombre
     * @return
     */
    String convert(int nombre)
    {
        StringBuilder result = new StringBuilder();
       if (nombre % 3 == 0) {
           result = new StringBuilder(FIZZ);
       }
       if (nombre % 5 == 0)
       {
           result.append(BUZZ);
       }

       String nombreEnChaine = Integer.toString(nombre);
       if (nombreEnChaine.chars().mapToObj(Character::toString).anyMatch("3"::equals)) {
        result.append(FIZZ);
       }

       if (nombre == 0 || result.isEmpty())
       {
           result = new StringBuilder(nombreEnChaine);
       }
      return result.toString();
    }
}
