package recursion;

import java.math.BigDecimal;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1534236469;
//		BigDecimal bNum=new BigDecimal(num);
//		System.out.print(new BigDecimal(Math.pow(2,31)));
//
//		if(bNum.compareTo(new BigDecimal(Math.pow(2,31))) <=1 )
//		{
//			System.out.print(0);
//		}
		int realNum=num;
		int total=1;
		while(num>10)
		{
			num=num/10;
			total*=10;
		}
		int div=realNum/10;
		int rem=realNum%10;
		long reversedNumber=rem*total;
		while(div>0)
		{
			rem=div%10;
			div=div/10;
			total/=10;
			reversedNumber+=rem*total;
		}
		System.out.println(reversedNumber);
	}

}
