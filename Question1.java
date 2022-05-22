class Leaders
{
    void findLeader(int arr[], int n)
	{
		int max = arr[n-1];
		System.out.print(max + " ");
	
		for (int i = n-1; i >= 0; i--)
		{
			if (max < arr[i])
			{		
			max = arr[i];
			System.out.print(max + " ");
			}
		}	
	}

	public static void main(String[] args)
	{
		Leaders l = new Leaders();
		int arr[] = {7, 10, 4, 10, 6, 5, 2};
		int n = arr.length;
		l.findLeader(arr, n);
	}
}
