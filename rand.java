
import java.util.Random;

public class rand {
 
    
    public static String  generateRandWord(){

        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        int limit = 52;
        String word = Character.toString(abc.charAt(rand.nextInt(limit)))
                .concat(Character.toString(abc.charAt(rand.nextInt(limit))))
                .concat(Character.toString(abc.charAt(rand.nextInt(limit))))
                .concat(Character.toString(abc.charAt(rand.nextInt(limit))))
                .concat(Character.toString(abc.charAt(rand.nextInt(limit))));

        return word;
    }

}
