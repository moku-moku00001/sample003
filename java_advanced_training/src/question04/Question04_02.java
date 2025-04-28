package question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question04_02 {

	public static void main(String[] args)throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str1 = reader.readLine();
		String str2 = reader.readLine();
		String str3 = reader.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int num3 = Integer.parseInt(str3);
		int inum =(int)((num1 + num2 + num3 )* 0.7);
		
		System.out.println("合計" + inum + "円");
		System.out.println("平均" + inum/3 + "円");
	}

}
