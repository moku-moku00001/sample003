package question07; 
 
public class Question07_02 { 
	public static void main(String[] args) { 
		for (int i = 1; i <= 10; i++) { 
			
			if( i == 5 ) {
				continue;
			}else{
				System.out.println(i + "回目の処理です");	 
			}
			
		}
		
		System.out.println("処理を終了します"); 
		
	} 
} 