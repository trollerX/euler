/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler4;

/**
 *
 * @author Karma
 */
public class Euler4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int largestPalindrome = 0;
        int numberA = 100;
        int numberB = 100;
        String multiplication = "";
//        String multiplication = numberA + "x" + numberB;
//        System.out.println(multiplication);

        for(int i = numberA; i < 1000; i++){
            for(int j = numberB; j < 1000; j++){
                int product = i * j;
//                System.out.println(i + "x" + j + "=" + product);
                String productStringReversed = "";
                String productString = Integer.toString(product);

                for (int k = productString.length() - 1; k >= 0; k--) {
                    productStringReversed += productString.charAt(k);
                }
//                System.out.println(productStringReversed);

                if (Integer.parseInt(productStringReversed) == product && product > largestPalindrome) {
                    largestPalindrome = product;
                    multiplication = i + "x" + j;
                }

                
//                System.out.println(numberB);
            }
            

        }

        System.out.println("The largest palindrome made from the product of two 3-digit numbers is " + multiplication + " = " + largestPalindrome);

    }

}
