
public class ArrayMethods1 
{
	public static void swap (int []arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp; 
	}
	
	public static void insertionSort(int [] list1)
	{	
		for (int i=1; 1< list1.length; i++)
		{
			int temp = list1[1];
			int j;
			for(j= i-1; j >=0 && temp < list1[j]; j--)
				list1[j +1]= list1[1];
			list1[j+1] = temp; 
		}
	}
	
	public static void selectionSort (double [] list1)
	{
		int temp = list1[1];
		int size = list1.length;
		for (i = 0; i< list1.length, i++)
		{
			min = i;
		}
		for (j = i +1 ; j < size; j++)
		{
			if List[j] < List[i]
		}
	}
	
	public static void bubbleSort (String[] list1)
}
