package Assignment4;

public class UniqueCharsSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("palindrome");
		System.out.println("The String is : "+str);
		boolean hasUnique=true;
		char c;
		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				if(Character.toLowerCase(c)==str.charAt(j))
				{
					hasUnique=false;
				}
			}
		}
		if(hasUnique)System.out.println("The String has all unique characters");
		else System.out.println("The String has duplicate characters");
	}

}
