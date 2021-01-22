/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import java.util.Scanner;

/**
 *
 * @author Milo
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Give in the Clesius value: ");
        Scanner sc = new Scanner(System.in); //Read input of user, need to import java.util.Scanner.
        double celsius = sc.nextDouble();
        double fahrenheit = 9.0 / 5.0 * celsius + 32.0; //use double in division otherwise it will be rounded 
        System.out.println("Farenheit is: " + fahrenheit);
    }
    
}
