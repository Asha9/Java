package techno;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		int marksObtained,passingMarks;
		passingMarks=40;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your marks obtained:");
		marksObtained=input.nextInt();
		if(marksObtained>=passingMarks) {
			System.out.println("You passed the exam");
		}
		else
		{
			System.out.println("Unfotunately you failed the exam");
		}
	}

}
