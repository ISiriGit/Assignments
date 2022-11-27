package Assignment4;


public class RemoveStrDupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="narayana";
		String str="Sirisha";
		char c;
		System.out.println("Initial String : "+str);
		int strLen=str.length();
		for(int i=0;i<strLen;i++)
		{
			c=str.charAt(i);
			for(int j=i+1;j<strLen;j++)
			{
				if(Character.toLowerCase(c)==Character.toLowerCase(str.charAt(j)))
				{
					str=str.substring(0, j)+str.substring(j+1);
					strLen--;
					j--;
				}
			}
		}
		System.out.println("String with out Duplicates : "+str);
	}

}
