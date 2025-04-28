package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question03_01 {

	public static void main(String[] args)throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str1 = reader.readLine();
		String str2 = reader.readLine();
		String str3 = reader.readLine();
		
		System.out.print(str1);
		System.out.print(str2);
		System.out.print(str3);
	}

}
