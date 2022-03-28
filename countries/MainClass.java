/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countries;

/**
 *
 * @author Юрий
 */
public class MainClass {
    public static void main(String[] args) {
       Countries[] country = new Countries[10];
       country [0] = new Countries("Russia" ,146, 146.7, "Moskow", 12.6);
       country [1] = new Countries("Finland",338 ,5.5, "Helsinki", 655);
       country [2] = new Countries("France", 643.8, 67.8, "Paris", 2.1);
       country [3] = new Countries("Andora", 467, 85.4, "Andora la Vella", 22.6);
       country [4] = new Countries("Singapore", 725, 5.7);
       Countries.printAll(country);
       
       
       
    }
    
}
