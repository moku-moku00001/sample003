package question09; 
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
 
public class Question09_08 { 
	public static void main(String[] args) throws IOException { 
			BufferedReader br = new BufferedReader(new 
                              InputStreamReader(System.in)); 
 
			System.out.println("整数を入力してください"); 
			String str = br.readLine(); 
			int num = Integer.parseInt(str); 
			 
			if (num%2 == 0) { 
				System.out.println("偶数が入力されました"); 
			} else {
				System.out.println("奇数が入力されました");
			}
		} 
}