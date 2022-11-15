package Assignment1;

public class Assign4 {

	public static void main(String[] args) {
		
		int r=5,c=35;
		for (int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if((i==0&&j<5)||(i==r-1&&j<5)||j==(r-1)/2
						||j==5||j==9||(j==i+5&&j>5)
						||j==10||((i==0||i==(r-1)/2||i==r-1)&&j<15&&j>10)
						||((j==15||j==19)&&i<r-1)||(i==r-1&&j<19&&j>15)
						||j==20||j==24&&i<(r-1)/2||(i==0||i==(r-1)/2)&&j>19&&j<25
						||((i==r-2)&&(j==22))||(i==r-1 && j == 23)
						||((j==25||j==29)&&i>0&&i<r-1)
						||((i==0||i==r-1)&&j<29&&j>25)
						||j==30||j==34||(j==i+30&&j>5)
						)
				System.out.print("@");
				else
					System.out.print(" ");
				System.out.print(" ");
			}
			System.out.println();
		}
			
	}

}
