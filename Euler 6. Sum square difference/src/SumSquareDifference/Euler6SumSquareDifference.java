/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SumSquareDifference;
import java.util.*;
/**
 *
 * @author Karma
 */
public class Euler6SumSquareDifference {

    /**
     * @param args the command line arguments
     */
    public static Integer sumOfSquares(ArrayList<Integer> numbers){
        int sum = 0;
        for(int i : numbers){
            sum+= i*i;
        }
        return sum;
    }
    
    public static Integer squareOfSum(ArrayList<Integer> numbers){
        int sum = 0;
        for(int i : numbers){
            sum += i;
        }
        return sum*sum; 
    }
    
    public static ArrayList<Integer> firstNumbers(int howManyNumbers){
//        int limit = howManyNumbers;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<=howManyNumbers;i++){
            numbers.add(i);
        }
        return numbers;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("How many numbers?");
        int howManyNumbers = Integer.parseInt(reader.nextLine());
        ArrayList<Integer> numbers = firstNumbers(howManyNumbers);
        System.out.println("Result: " + (squareOfSum(numbers) - sumOfSquares(numbers)));
    }
    
}
