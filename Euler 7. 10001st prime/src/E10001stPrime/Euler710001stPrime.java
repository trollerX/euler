/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E10001stPrime;

import java.util.*;

/**
 *
 * @author Karma
 */
public class Euler710001stPrime {

    /**
     * @param args the command line arguments
     */
    public static boolean isPrime(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        for (int i = 3; i < number / 2; i += 2) {
//            System.out.println(number);

            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

//    public static Integer howManyPrimes(){
//        
//    }
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println(isPrime(15));
        int howManyPrimes = 1;
        Scanner reader = new Scanner(System.in);
        System.out.println("Which prime?");
        int placeInSeq = Integer.parseInt(reader.nextLine());
        System.out.println("************");

        for (int number = 3;; number += 2) {
//            System.out.print(number);

            if (isPrime(number)) {
                howManyPrimes++;
//                System.out.println(number);
                if (howManyPrimes == placeInSeq) {
                    System.out.println(placeInSeq + "th prime is: " + number);
                    break;
                }
            }

        }

    }

}
