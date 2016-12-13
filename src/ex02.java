import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
		 char x=scn.next().charAt(0);
		 if(x>='A'&& x<='Z'){
			 System.out.print("capital" );
		 }else if(x>='a'&&x<='z'){
			 System.out.print("lowercase " );
		 }else{
			 System.out.print("special " );
		 }
	}

}
