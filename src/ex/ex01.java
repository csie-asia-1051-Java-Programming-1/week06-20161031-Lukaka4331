package ex;
import java.util.Scanner;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 105021044 鐘岑哲
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn=new Scanner(System.in);
      System.out.println("n=");
    int n=scn.nextInt();
	      System.out.println("c=");
	      char c=scn.next().charAt(0);
      fun1(n,c);
	}
		public static void fun1(int n,char c){
				for(int i = 1;i<=n;i++){for(int j = 1;j<=n;j++){
					 System.out.print(c);
				}
				     
 System.out.println();
		
		}
			     

				
		}
		
		
	
		
		
		
		
	}


