/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomintegers;
import java.security.SecureRandom;
/**
 *
 * @author Milo
 */
public class RandomIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        //loop 20 times
        for (int counter = 1; counter <= 20; counter++){
        //pick random interger from 1 to 6
        int face = 2 + randomNumbers.nextInt((10)+1)*2;// 0-5 + 1 = 
        System.out.printf("%d ", face);
        // if counter to 5 then start a new line
        if (counter % 5 == 0){
            System.out.println();
        }
        }
    }
    
}
