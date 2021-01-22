/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boiler;

import java.util.Scanner;

/**
 *
 * @author Milo
 */
public class BoilerAndFreezing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Give in the temperature: ");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp >= 100) {
            System.out.println("The water is boiling!");
        }
        else if (temp <= 0) {
            System.out.println("Water is freezing!");
        } if ( 0 < temp && temp > 100 )
                System.out.println("It is normal!");
        }
        
    }
    
}
