/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import java.util.Scanner;

/**
 *
 * @author Milo
 */
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //reading the input with scanner
        Scanner input = new Scanner(System.in);
        
        //creating account object: account1 and account2
        Account account1 = new Account("Long Tran");
        Account account2 = new Account("Bob");
        
        //display the values of names
        System.out.printf("Account 1 name is: %s%n", account1.getName());
        System.out.printf("Account 2 name is: %s%n", account2.getName());
        
        //prompt for and read name
        System.out.println("Your name: ");
        String theName = input.nextLine();
        account1.setName(theName);
        System.out.println();
        
        System.out.printf("Name in object myAccount is: %n%s%n", account1.getName());
    }
}
