package recursion;

import java.util.Scanner;

public class PrintNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		printName(1,n);

	}
	public static void printName(int in, int num)
	{
		if(in>num)
			return;
	
		System.out.println("Priyadharshini");
		printName(++in,num);
	}
}
