package GenerateRandomInteger;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(getRandomNumberInRange(0, 10 ,"Random"));
                System.out.println(getRandomNumberInRange(0, 10 ,"MATH"));
                System.out.println(getRandomNumberInRange(0, 10 ,"ints"));

                System.out.println("-----------------------------------");
            }

            //java8 ints
            Random random = new Random();
            random.ints(10, 33, 38).forEach(System.out::println);
           int x = random.ints(10,1,5).limit(1).findFirst().getAsInt();
            System.out.println("x " + x);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("e" + e);
        }
    }


    private static int getRandomNumberInRange(int min, int max , String type) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        if(type.equals("Random")){
            return r.nextInt((max - min) + 1) + min;
        }else if(type.equals("MATH")){
            return (int)(Math.random() * ((max - min) + 1)) + min;
        }else {
            return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
        }


    }


}
