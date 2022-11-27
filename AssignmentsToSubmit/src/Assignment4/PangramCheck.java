
package Assignment4;

public class PangramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("The quick brown fox jumps over a lazy dog");
		//String str="Mr. Jock, TV quiz PhD., bags few lynX";
//		String str="i am testing a code";
		System.out.println("Initial String is : "+str);
		boolean isPresent=true;
		char []alphaArray=new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<alphaArray.length;j++)
			{
				char c=str.charAt(i);
				if(Character.toUpperCase(c)==alphaArray[j])
				{
					alphaArray[j]='*';
					break;
				}
			}
		}
		for(char c:alphaArray)
		{
			if(c!='*')
			{
				isPresent=false;
			}
		}
		if(isPresent)System.out.println("The given String is a Pangram");
		else System.out.println("The given String is not a Pangram");
		

	}

}
