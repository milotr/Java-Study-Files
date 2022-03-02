/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Milo
 */
public class Account {
    private String name; // instance var
    
    public Account(String name) {
        this.name = name;
    }
    public Account(){
        this.name = "N/A";
    }
    //method: setting name in the object
    public void setName(String name){
        this.name = name;
    }
    //method: read name from the object
    public String getName() {
        return name;
    }  
}
