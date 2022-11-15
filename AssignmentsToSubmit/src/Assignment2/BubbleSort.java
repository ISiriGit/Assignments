package Assignment2;


public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] ={3,60,35,2,45,320,5}; 
		System.out.println("Initial array");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println("");
		int temp;
		for(int i=0;i<arr.length;i++)
		{ 
			temp=0;
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\nsorted array is");
		for(int i:arr)
			System.out.print(i+" ");
	}

}

