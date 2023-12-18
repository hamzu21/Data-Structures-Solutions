public class SelectionSort
 {
    public static void main(String[] args) 
	{
        int[] arr = {15, 25, 64, 11, 22};
        int n = arr.length;

        System.out.println("Original Array:");
        for (int value : arr) 
		{
            System.out.print(value + " ");
        }
        System.out.println();

        for (int i = 0; i < n - 1; i++) 
		{
            int minIndex = i;

            for (int j = i + 1; j < n; j++)
				{
                if (arr[j] < arr[minIndex])
					{
                    minIndex = j;
                }
            }

         
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("Sorted Array:");
        for (int value : arr)
			{
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

