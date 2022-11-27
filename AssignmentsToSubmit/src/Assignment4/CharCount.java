package Assignment4;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Program# @ Strings";
		char charArray[]=str.toCharArray();
		int vowCount=0,consCount=0,specharCount=0;
		for(int i=0;i<charArray.length;i++)
		{
			char ch=charArray[i];
			if(ch==97||ch==101||ch==105||ch==111||ch==117
					||ch==65||ch==69||ch==73||ch==79||ch==85)
			{
				vowCount++;
			}
			else if(ch>=32&&ch<=47||ch>= 58&&ch<=64 ||ch>=91&&ch<=96 ||ch>= 123&&ch<=126)
			{
				specharCount++;
			}
			else
			{
				consCount++;
			}
		}
		System.out.println("Number of Vowels in the string are : "+vowCount);
		System.out.println("Number of Consonants in the string are : "+consCount);
		System.out.println("Number of Special Character in the string are : "+specharCount);
	}

}
