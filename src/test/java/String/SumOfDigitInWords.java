package String;

public class SumOfDigitInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a11b22c33d";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				sum=sum+n;
			}
		}

		System.out.println(sum);
	}

}
