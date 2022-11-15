package Assignment2;

public class MergeSort {
	void startMerge(int[] arr, int start, int pivot, int end)
	{
		int i,j,k;
		int n1=pivot-start+1;
		int n2=end-pivot;
		int leftArr[]=new int[n1];
		int rightArr[]=new int[n2];

		for(i=0;i<n1;i++)
			leftArr[i]=arr[start+i];
		for (j = 0; j < n2; j++)    
			rightArr[j] = arr[pivot+1+j];  
		i=0;j=0;k=start;

		while (i < n1 && j < n2)    
		{    
			if(leftArr[i] <= rightArr[j])    
			{    
				arr[k] = leftArr[i];    
				i++;    
			}    
			else    
			{    
				arr[k] = rightArr[j];    
				j++;    
			}    
			k++;    
		}    
		while (i<n1)    
		{    
			arr[k] = leftArr[i];    
			i++;    
			k++;    
		}    

		while (j<n2)    
		{    
			arr[k] = rightArr[j];    
			j++;    
			k++;    
		}    
	}
	void sortArray(int[] arr, int start, int end)
	{
		if(start<end)
		{
			int pivot=(start+end)/2;
			sortArray(arr, start, pivot);
			sortArray(arr, pivot+1, end);
			startMerge(arr,start,pivot,end);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] ={3,1,35,2,45,320,5}; 
		int arr[] ={5,1,12,-5,16,2,12,14};
		System.out.println("initial array : ");

		for(int e:arr)System.out.print(e+" ");
		System.out.println();

		MergeSort ms=new MergeSort();
		ms.sortArray(arr,0,arr.length-1);
		System.out.println("Sorted array : ");

		for(int e:arr)System.out.print(e+" ");
		System.out.println();
	}

}
