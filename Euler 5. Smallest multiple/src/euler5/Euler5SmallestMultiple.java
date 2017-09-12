/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler5;

import java.util.*;

/**
 *
 * @author Karma
 */
public class Euler5SmallestMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 20, i = 2, limit = 20;
		boolean notFound = true;

		while (notFound) {
			if (number % i == 0 && i <= limit) {
				i++;
				if (i > limit) {
					notFound = false;
				}
			} else {
				number += 20;
				i = 2;
			}
		}
		System.out.println(
				"smalles postive number that is evenly divisible by all of the numbers from 1 to 20 is: " + number);
    }

}
