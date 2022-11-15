package Assignment2;

public class ArraySubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,20,30,40,70,50,60};
		int arr2[]= {70,50,60};
		boolean dupFlag=false;
		for(int i=0,j=0;i<arr1.length&&j<arr2.length;)
		{
			
				if(arr1[i]==arr2[j])
				{System.out.println(i+"va "+j+"va");
				System.out.println(arr1[i]+""+arr2[j]);
					j++;i++;
					if(j==arr2.length-1)
						dupFlag=true;
				}
				else
				{
					System.out.println(i+"val "+j+"val");
					i++;
					j=0;
				}
		}
		System.out.print("Array 1 is : ");
		for(int i:arr1)System.out.print(i+" ");
		System.out.print("\nArray 2 is : ");
		for(int i:arr2)System.out.print(i+" ");
		if(dupFlag==true)
			System.out.println("\nArray2 is subset of Array1");
		else
			System.out.println("\nArray2 is not a subset of Array1");
	}

}
