package ex;import java.util.Scanner;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.print("輸入幾個數");
        int n=scn.nextInt();
        int data[]=new int[n];
        for(int i=0;i<data.length;i++){
        	data[i]=scn.nextInt();
        }
        fun(data);}
	public static void fun(int data[]){
		for(int i=0;i<data.length;i++){
			data[i]=data[i]*data[i];
			System.out.println(data[i]);
			
		}
	}

}
