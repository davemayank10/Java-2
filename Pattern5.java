class Pattern5{
	public static void main(String[] args) {
		int n=5,i=1;
		while(i<=n)
		{
			int j=1;
			int k=1;
			while(j<=i)
			{
				System.out.print(k*k+" ");
				j++;
				k++;
			}
			System.out.println();
			i++;
		}
	}
}