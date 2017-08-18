package techno;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		n=input.nextInt();
		while(n!=0)
		{
			System.out.println("You entered:"+n);
			System.out.println("Enter an integer:");
		}
		System.out.println("out of loop");
	
	}

}
