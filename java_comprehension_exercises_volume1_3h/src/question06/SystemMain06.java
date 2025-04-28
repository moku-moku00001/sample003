package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain06 {

	public static void main(String[] args)throws IOException {
		//(1)
		for ( int i = 1; i <= 4; i++) {
			System.out.println("繰り返します。");
		}

		
		//(2)
		String[] studentName = {"かなこ","ゆうた","あい","はるひ","かずき"};
			
		for (String value : studentName) {
			System.out.println(value);
			
		}
		
		//(3)
		int amount = 0;
		int price = 100;
		
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("鉛筆を購入しますか？");
			System.out.println("はい：0、いいえ：1 >");
			
			String str = reader.readLine();
			int buyFlag = Integer.parseInt(str);

			
			while (buyFlag == 0){
				amount++;
				
				System.out.println("購入する鉛筆の個数を 1 つ増やしますか？");
				System.out.println("はい：0、いいえ：1 >");
				
				str = reader.readLine();
				buyFlag = Integer.parseInt(str);
				
				
			}
			System.out.println("購入した鉛筆の個数は" + amount+"個です。");
			System.out.println("従って、合計金額は" + ( amount * price ) + "円です。");
			
			
			//(4)
			int amountBooks = 0;
			int sellFlag = 0;
			int bookPrice = 200;
			
			System.out.println("本を売却します。");
			
			do  {
				amountBooks++;
				System.out.println("売却する本の冊数を 1 つ増やしますか？");
				System.out.println("はい：0、いいえ：1 >");
				
				str = reader.readLine();
				sellFlag = Integer.parseInt(str);
				
			} while (sellFlag == 0); {
				System.out.println("売却する本の冊数は" + amountBooks+"個です。");
				System.out.println("従って、合計金額は" + ( amountBooks * bookPrice ) + "円です。");
			
			}
			
			
	}

}
