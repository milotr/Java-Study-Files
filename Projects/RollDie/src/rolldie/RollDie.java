/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rolldie;
import java.security.SecureRandom;
/**
 *
 * @author Milo
 */
public class RollDie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;
        
        for(int roll = 1; roll <= 60_000; roll++){
            int face = 1 + randomNumbers.nextInt(6);
        }
    }
    
}
