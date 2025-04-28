package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_02 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				System.out.println("1を入力してください");
				String str = br.readLine();
				int num = Integer.parseInt(str);
				
				str = (num == 1) ? "1が入力されました" : "1以外が入力されました";
				
				System.out.println(str);
	}

}
