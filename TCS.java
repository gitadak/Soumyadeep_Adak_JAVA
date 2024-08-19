/*
1 2 3 4 5
2 3 4 5 1
3 4 5 1 2
4 5 1 2 3
5 1 2 3 4
*/

class TCS
{
	public static void main(String... args)
	{
		int n=5;

		for(int i=1; i<=n;i++)
		{
			for(int j=i;j<n+i;j++)
			{
				if(j>n)
					System.out.print(j%n+" ");
				else	
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
