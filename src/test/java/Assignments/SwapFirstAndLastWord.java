package Assignments;

public class SwapFirstAndLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India";
		char[] ch = s.toCharArray();
		 char temp = ch[0];
		 ch[0]=ch[ch.length-1];
		 ch[ch.length-1]=temp;
		
		 for(int i=0;i<ch.length;i++)
		 {
			 System.out.print(ch[i]+ "");
			
			
		 }

}
}
