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
public class Boiler {

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
        else {
            System.out.println("The water is not boiling.");
        }
    }
    
}
