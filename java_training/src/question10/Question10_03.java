package question10; 
 
public class Question10_03 { 
 public static void main(String[] args) { 
 int n = 1;
 
 System.out.println("1 回目の繰り返し処理です"); 
 
 System.out.println("1回目");
 System.out.println("2回目");
 System.out.println("3回目");
 System.out.println("4回目");
 System.out.println("5回目");
 
 

 
 System.out.println("2 回目の繰り返し処理です");
 do  {System.out.println(n + "回目");
  n++; 
 }while (n <= 10);
 System.out.println("処理を終了します");
 } 
} 