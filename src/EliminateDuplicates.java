import java.util.Scanner;

public class EliminateDuplicates {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int list[] = new int[10];
		
		System.out.print("Please Enter 10 numbers: ");
		
		for(int z = 0; z < list.length; z++) {
			
			list[z] = input.nextInt();
		}
		
		int New_List[] = eliminateDuplicates(list);
		
		System.out.print("Your List without Duplicates is: ");
		
		if(New_List[0] == 0) {
			
			System.out.print(0 + " ");
			
		}
		
		for(int l = 0; l < New_List.length; l++) {
			
			//Duplicates are now zero, irrelevant
			if(New_List[l] != 0) {
				
				System.out.print(New_List[l] + " ");
			}
			
		}

	}
	
	public static int[] eliminateDuplicates(int[] list) {
		
		java.util.Arrays.sort(list);
		
		int New_List[] = new int[10];;
	
		//Checks each position individually
		for (int i = 0; i < list.length; i++){
			
			//Compares to rest 
		    for (int j = 1; j < list.length; j++) {
		    	
		    	if(list[i] != list[j]) {
		    		
		    		System.out.print(list[i]);
		    	}
		    	
		    }
		}
		return New_List;                   
	}
}

	
