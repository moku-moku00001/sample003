package question07;

import java.util.Arrays;

public class Question07_03 { 
	public static void main(String[] args) { 
	 int[] num = {30, 53, 21, 70, 60}; 
 
	 Arrays.sort(num);
	 		 System.out.println("ソートが完了しました"); 
	 for (int value : num) {
		 	System.out.print(value + " "); 
	 	}
	 
	 /*for (int i = 0; i < num.length - 1; i++) { 
		 for (int j = i + 1; j < num.length; j++) { 
			 if (num[i] > num[j]) { 
				 int tmp = num[i]; 
				 num[i] = num[j]; 
				 num[j] = tmp; 
			 } 
		 } 
	 } 
	 
 
	 for (int i = 0; i < num.length; i++) { 
		 
		
	 }  */
	} 
} 