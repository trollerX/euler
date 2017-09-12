/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler1Multiplesof3and5;

/**
 *
 * @author Karma
 */
public class Euler1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 | i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of all the multiples of 3 or 5 below 1000 is " + sum + ".");
    }

}
