/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpecialPythagoreanTriplet;

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;
import java.util.*;

/**
 *
 * @author Karma
 */
public class Euler9SpecialPythagoreanTriplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double a = 1, b, c;
        
        mainLoop:
        while (true) {
            b = a + 1;
            while (a + b + sqrt(Math.pow(a, 2) + Math.pow(b, 2)) <= 1000) {
                c = sqrt(Math.pow(a, 2) + Math.pow(b, 2));

//            System.out.println("a = " + a + ", b = " + b + ", c = " + c);
//                if (floor(c) == c) {
//                    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
//                    System.out.println("a + b + c = " + (a + b + c));
//                    System.out.println("a * b * c = " + (a * b * c));
//                    System.out.println("*************");
//                }
                if (a + b + c == 1000) {
                    int aInt = (int) a;
                    int bInt = (int) b;
                    int cInt = (int) c;
                    System.out.println("a = " + aInt + ", b = " + bInt + ", c = " + cInt);
                    System.out.println("a + b + c = " + (aInt + bInt + cInt));
                    System.out.println("a * b * c = " + (aInt * bInt * cInt));
                    break mainLoop;
                }
                b++;
            }
            a++;
        }

    }

}
