package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0908 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int i = 0;
	
	System.out.println("おにぎりを購入しますか？");
	System.out.print("はい：0、いいえ：1>");
	String choise = br.readLine();
	int buyFlag = Integer.parseInt(choise);
	// buyFlagが0の場合、繰り返す
	while(buyFlag == 0) {
		i++;
		System.out.println("購入するおにぎりの個数を1つ増やしますか？");
		System.out.print("はい：0、いいえ：1>");
		choise = br.readLine();
		buyFlag = Integer.parseInt(choise);	
		
	}

	System.out.println("購入したおにぎりの個数は" + i + "個です");
	}

}
