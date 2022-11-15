package Assignment1;

public class Assign5 {


public static void main(String[] args) {
	// TODO Auto-generated method stub
		int n=14;
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++)
			{
				if(j==1
						||i==1
						||i==n
						||j<=n/2-i+1
						||i>n/2&&j<i-n/2+2
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