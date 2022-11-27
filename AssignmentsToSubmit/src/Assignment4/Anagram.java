package Assignment4;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1="EARTH";String str2="HEART";
//		String str1="INTEGRAL";String str2="TRIANGLE";
		String str1="PEEK";String str2="KEEP";
//		String str1="tooth";String str2="teeth";
//		String str1="feet";String str2="foot";
		boolean isAnagram=false;
		if(str1.length()==str2.length())
		{
			for(int i=0;i<str1.length();i++)
			{
				for(int j=0;j<str2.length();j++)
				{
					if(Character.toUpperCase(str1.charAt(i))==Character.toUpperCase(str2.charAt(j)))
					{
						isAnagram=true;
						break;
					}
					else
					{
						isAnagram=false;
					}
				}
				if(isAnagram==false)
				{
					break;
				}
			}
			if(isAnagram)
				System.out.println("Given Strings are Anagram");
			else
				System.out.println("Given Strings are not Anagram");
		}
		else
			System.out.println("The given strings are not Anagram");
	}

}
