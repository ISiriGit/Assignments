package Assignment1;

public class Assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=8,c=14;
		for(int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				if(j==0
						||j<i+1
						||j>=c-i-1
						||j==c-1
						)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
