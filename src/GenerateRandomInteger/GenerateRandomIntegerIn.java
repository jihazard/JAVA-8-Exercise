package GenerateRandomInteger;

import java.util.Random;

public class GenerateRandomIntegerIn {

    private  static int getRandomNumberInRange(int min, int max){
        if(min >= max){
            throw new IllegalArgumentException("max must be greate than min");
        }
        Random random = new Random();
        return random.nextInt((max- min)+1) +min;

    }

             //풀이
            //4. Test [10...30]
            // min = 10 , max = 30, range = (max - min)
/*           new Random().nextInt((max - min) + 1) + min
            new Random().nextInt((30 - 10) + 1) + 10
            new Random().nextInt((20) + 1) + 10
            new Random().nextInt(21) + 10   */

                //[0...20] + 10 = [10...30]


}
