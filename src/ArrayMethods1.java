
public class ArrayMethods1 
{
	public static void swap (int []list1, int index1, int index2)
	{
		int temp = list1[index1];
		list1[index1] = list1[index2];
		list1[index2] = temp; 
	}
	
	public static void insertionSort(int [] list1)
	{	
        int n = list1.length;
        
        for (int i=1; i<n; i++)
        {
            int k = list1[i];
            int j = i-1;
 
            while (j>=0 && list1[j] > k)
            {
                list1[j+1] = list1[j];
                j = j-1;
            }
            list1[j+1] = k;
        }
    }
	public static void selectionSort (double [] list1)
	{
		int n = list1.length;
		for (i = 0; i < n-1; i++)
		{
			for (j = i+1; j < n-1; j++)
			{
				if (j < i)
				{
					int j = list1[i];
					list1[i] = list1[i +1];
					list1[i+1] = j;
				}
			}
		}
	}
	
	public static void bubbleSort (String [] list1)
	{
		int n = list1.length;
		while swap = 0;
		 for (int i = 0; i < n-1; i++)
		   for (int j = 0; j < n-i-1; j++)
		      if (list1[j] > list1[j+1])
		        {
		          int temp = list1[j];
		          list1[j] = list1[j+1];
		          list1[j+1] = temp;
		        }
	}
}
