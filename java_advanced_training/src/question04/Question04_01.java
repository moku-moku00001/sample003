package question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question04_01 {

	public static void main(String[] args)throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		
		int num = Integer.parseInt(str);
		int inum =(int)(num * 0.7);
		
		
		System.out.println("３割引きで" + inum + "円です。");
	}

}
