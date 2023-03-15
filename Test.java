class Test 
{
	public static void main(String[] args) 
	{
		int[] x = {10,20,30,40};
		int[] y = {50,60};
		
		x = y;
		
		for (int z : x )
		{
			System.out.println(z);
		}

	}
}
