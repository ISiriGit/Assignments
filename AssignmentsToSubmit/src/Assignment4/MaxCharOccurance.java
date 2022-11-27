package Assignment4;

public class MaxCharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java job";
		//String str="Pangram";
		//String str="Remove";
		System.out.println("Initial String is "+str);
		char dupChar[]=new char[str.length()];
		int   charCount[]=new int[str.length()];
		int index=0;
		boolean hasDups=false;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			int count=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(Character.toLowerCase(c)==str.charAt(j))
				{
					count++;
				}
			}
			if(count>1&&count>charCount[index])
			{
				charCount[index]=count;
				dupChar[index]=c;
				hasDups=true;
			}
			else if(count>1&&count==charCount[index])
			{
				index++;
				charCount[index]=count;
				dupChar[index]=c;
				hasDups=true;
			}
		}
		if(hasDups)
		{
			System.out.print("Character \'");
			for(int i=0;i<=index;i++)
			{
				System.out.print(dupChar[i]+"\'");
				if(i<index)System.out.print(" and \'");
			}
			System.out.print(" occured "+ charCount[index]+" times");
		}
		else
			System.out.println("No Duplicate characters in the given String");
	}

}
