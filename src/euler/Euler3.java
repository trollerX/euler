import java.util.ArrayList;

public class Euler3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=2896547896L;
		long ori=num;
		ArrayList<Integer> prime = new ArrayList<Integer>();
		
		while (num>1) {
			while (num%2==0) {
				prime.add(2);
				num=num/2;
			}
			for (int i=3;i<=num;i=i+2) {
				if (num%i==0) {
					prime.add(i);
					num=num/i;
					i-=2;
					
				}
				
			}
			
		}
		System.out.println("The prime factors of " + ori + " are " + prime + ".");
	}

}
