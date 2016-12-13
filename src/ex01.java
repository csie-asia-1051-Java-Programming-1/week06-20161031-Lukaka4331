import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn=new Scanner(System.in);
     System.out.println("¿é¤J=");
     String str=scn.nextLine();
     char data[]=str.toCharArray();
     for(int i=data.length-1;i>-1;i--){
		 System.out.print(data[i]);
	 }
	}

}
