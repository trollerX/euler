
public class Euler2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 2;
		int i=1,j=2,k=i+j;
		while (k<4000000) {
			if (k%2==0) sum+=k;
			i=j;
			j=k;
			k=i+j;
		}
		
		System.out.println("The sum is "  + sum + ".");
		
			
		}
}
