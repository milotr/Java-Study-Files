/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fightling;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Milo
 */
public class Fightling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Attack points of Monster:");
        int monsterAtk = sc.nextInt();
        System.out.println("Defense points of Monster:");
        int monsterDef = sc.nextInt();
        System.out.println("Damage points of Monster:");
        int monsterDmg = sc.nextInt();
        System.out.println("Life points of Monster:");
        int monsterLif = sc.nextInt();
        
        System.out.println("Attack points of player:");
        int playerAtk = sc.nextInt();
        System.out.println("Defense points of player:");
        int playerDef = sc.nextInt();
        System.out.println("Damage points of player:");
        int playerDmg = sc.nextInt();
        System.out.println("Life points of player:");
        int playerLif = sc.nextInt();
        
        Random generator = new Random();
        boolean attacker = generator.nextBoolean();
        if (attacker) {
            System.out.println("You attack");
            int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
            int attackValue = yourAttack + dice;
            System.out.println("Rooled values: "+dice);
            System.out.println("Your attack value: " + attackValue);
            if (attackValue > monsterDef) {
                System.out.println("Your attack is succesful.");
                
            }
        }
    }
    
}
