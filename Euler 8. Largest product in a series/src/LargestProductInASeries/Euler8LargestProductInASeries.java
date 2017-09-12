/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargestProductInASeries;

import java.util.*;

/**
 *
 * @author Karma
 */
public class Euler8LargestProductInASeries {

    public static boolean check(int a, int b, int c) {
        return (((a * a) + (b * b) == (c * c)) && (a + b + c == 1000));
    }

    public static ArrayList<Integer> makeNumberList(int limit) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < limit; i++) {
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("Type limit:");
        int limit = Integer.parseInt(reader.nextLine());

        ArrayList<Integer> numbers = makeNumberList(limit);

//        System.out.println(numbers.toString());
        for (int c = numbers.get(2); c < limit; c++) {
            for (int b = numbers.get(1); b < c; b++) {
                for (int a = numbers.get(0); a < b; a++) {

                }
            }
        }

        while (true) {
//            c = add(c);
//            System.out.println("c " + c);
            while (b < c) {
                if (check(a, b, c)) {
                    System.out.println("Numbers: " + a + ", " + b + ", " + c);
                    System.out.println("Product: " + a * b * c);
                    break;
                }
                System.out.println("Check for: " + a + " " + b + " " + c + " is " + check(a, b, c));

                b++;
//                System.out.println("b " + b);
            }
            a++;
            b = a + 1;
//            while (a < b) {
//                if (check(a, b, c)) {
//                    System.out.println("Numbers: " + a + ", " + b + ", " + c);
//                    System.out.println("Product: " + a * b * c);
//                    break;
//                }
//                System.out.println("Check for: " + a + " " + b + " " + c + " is " + check(a, b, c));
//              
//                a++;
////                System.out.println("a " + a);
//            }
//            a = numbers.get(0);
//            b = numbers.get(1);
        }
    }
}

}
