/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler2;

/**
 *
 * @author Karma
 */
public class Euler2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 2;
        int i = 1, j = 2, k = i + j;
        while (k < 4000000) {
            if (k % 2 == 0) {
                sum += k;
            }
            i = j;
            j = k;
            k = i + j;
        }

        System.out.println("The sum is " + sum + ".");
    }

}
