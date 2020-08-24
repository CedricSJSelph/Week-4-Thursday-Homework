import java.util.Scanner;

public class ReverseTheInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int Input_Numbers[] = new int[10];
		
		System.out.print("Please enter ten seperate integers: ");
		
		for(int i = 0 ; i < Input_Numbers.length; i++) {
			
			Input_Numbers[i] = input.nextInt();
			
		}
		
		System.out.print("Your numbers Reversed are: ");
		
		for(int j = (Input_Numbers.length - 1); j>=0; j--) {
			
			
			System.out.print(Input_Numbers[j] + " ");
		}
		

	}

}
