package Assignment2;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //int arr[] ={5,1,12,-5,16,2,12,14}; 
		int arr[] ={3,60,35,2,45,320,5}; 
			System.out.println("initial array");
			for(int i:arr)
				System.out.print(i+" ");
			System.out.println("");
			
			for(int i=0;i<arr.length;i++)
			{ 
				int temp1=arr[i],temp2,pos=i;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						if(temp1>arr[j])
						{
						temp1=arr[j];
						pos=j;
						}
					}
					System.out.println("in for j "+j);
					for(int e:arr)
						System.out.print(e+" ");
					System.out.println("\n temp and pos"+temp1+" "+pos);
				}
				temp2=arr[i];
				arr[i]=temp1;
				arr[pos]=temp2;
				System.out.println("\nbefore next sort");
				for(int ele:arr)
					System.out.print(ele+" ");
				System.out.println("\n");
			}
			System.out.println("\nsorted array is");
			for(int i:arr)
				System.out.print(i+" ");
	}
}
