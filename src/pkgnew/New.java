/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;

/**
 *
 * @author ASUS
 */
public class New {
    
    String name;
    int age;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        New a = new New();
        a.sayHBD("Alex");
    }
    
    public static void sayHBD(String name)
    {
        System.out.println("Happy Birthday " +name);
    }
}
 