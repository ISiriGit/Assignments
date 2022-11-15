package Assignment2;

public class QuickSort {

	private static int partition(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp,pivot=i;
		while(j>0)
		{
			if(i<=j)
			{
				temp=arr[i];
				if(arr[pivot]<arr[i]&&arr[pivot]>arr[j])
				{ 
					arr[i]=arr[j];
					arr[j]=temp;
					i++;
					j--;
				}
				else 
				{
					if(arr[pivot]>=arr[i])
					{
						i++;
					}
					if (arr[pivot]<=arr[j])
					{
						j--;
					} 
				}
			}
			else
			{
				temp=arr[pivot];
				arr[pivot]=arr[j];
				arr[j]=temp;
				break;  
			}
		}		
		return j;
	}
	private static void sortArray(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(i<j) {
		int pivot=partition(arr,i,j);
		sortArray(arr, i, pivot-1);
		sortArray(arr, pivot+1, j);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={3,1,35,2,45,320,5,2,45}; 
		//int arr[] ={5,1,12,-5,16,2,12,14};
		System.out.println("initial array : ");
		
		for(int e:arr)System.out.print(e+" ");
		System.out.println();
		
		sortArray(arr,0,arr.length-1);
		
		System.out.println("\nSorted Array is ");
		for(int e:arr)System.out.print(e+" ");
	}

	

}

