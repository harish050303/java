package Assignments;

public class SumOfEachDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4534;
		int sum=0;
		
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
			System.out.println(sum);
	}

}
