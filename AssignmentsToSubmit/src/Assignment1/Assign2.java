package Assignment1;

public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Printing house
		int n=15;
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i==0
						||j==0
						||j==n-1
						||i==n-1
						||i<(n-1)/2&&j<=(n-1)/2-i
						||i<(n-1)/2&&j>=(((n-1)/2)+i)
						)
				{
				System.out.print("*");
					//System.out.println(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
