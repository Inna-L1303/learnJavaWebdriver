package PavanJava;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {
    public static void main(String[]args){
        //1.Random class
        Random rand = new Random();
        int rand_int = rand.nextInt(50);
        System.out.println(rand_int);

        double rand_dbl = rand.nextDouble(); // range 0.0 and less than 1.0
        System.out.println(rand_dbl);

        //2. Math class
        System.out.println(Math.random());

        //3. Apache commons lang API
        //http://commons.apache.org/


    }
}
