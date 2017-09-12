/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler3;

import java.util.*;/**
         *
         * @author Karma
         */

public class Euler3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long num = 2896547896L;
        long ori = num;
        ArrayList<Integer> prime = new ArrayList<Integer>();

        while (num > 1) {
            while (num % 2 == 0) {
                prime.add(2);
                num = num / 2;
            }
            for (int i = 3; i <= num; i = i + 2) {
                if (num % i == 0) {
                    prime.add(i);
                    num = num / i;
                    i -= 2;

                }

            }

        }
        System.out.println("The prime factors of " + ori + " are " + prime + ".");

    }

}
