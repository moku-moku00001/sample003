package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_01 {

	public static void main(String[] args)throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("整数を入力してください");
		String str = reader.readLine();
		int num = Integer.parseInt(str);
		
		if( num%10 == 0) {
			System.out.println(num + "は10の倍数です。");
			
		} else {
			System.out.println(num + "は10の倍数ではありません。");
		}
	}

}
