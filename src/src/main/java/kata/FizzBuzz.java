package kata;

public class FizzBuzz {

    public static void main(String [] args){

    }

    /**
     * fonction qui en fonction du paramètre renvoie:
     * - fizz si le nombre en paramètre est divisible par 3,
     * - buzz si le nombre est divisible par 5
     * - le nombre en paramètre dans les autres cas
     * @param nombre
     * @return
     */
    String convert(int nombre)
    {
       if (nombre == 3) {
           return "fizz";
       }
           else {
            return Integer.toString(nombre);
        }
    }
}
