package Assignment4;

public class PalindromeChk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="2552";
		System.out.println("Initial String is "+str);
		String temp=(new StringBuffer(str)).reverse().toString();
		System.out.println("Reversed String is "+temp);
		if(str.equals(temp))
		{
			System.out.println("Given String is a Palindrome");
		}
		else
		{
			System.out.println("Given String is not a Palindrome");
		}
	}

}
