package Assignment4;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		char c;
		System.out.println("Initial String : "+str);
		System.out.print("Duplicate characters in the String are :");
		int strLen=str.length();
		boolean dupFlag;
		for(int i=0;i<strLen;i++)
		{
			c=str.charAt(i);
			dupFlag=false;
			for(int j=i+1;j<strLen;j++)
			{
				
				if(Character.toLowerCase(c)==Character.toLowerCase(str.charAt(j)))
				{
					str=str.substring(0, j)+str.substring(j+1);
				strLen--;
				j--;
				dupFlag=true;	
				}
			}
			if(dupFlag)System.out.print(" "+c+" ");
		}
	}

}
