package String;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num= 454;
		int rem=0;
		int sum=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}





