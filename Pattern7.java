class Pattern7{
	public static void main(String[] args) {
		int i,j,k,l,m,n,o,p;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=j;k++)
			{
				System.out.print("*");
			}
			for(l=1;l<=k;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//new forloop
		for(m=1;m<=5;m++)
		{
			for(n=1;n<=m;n++)
			{
				System.out.print(" ");
			}
			for(o=5;o>=n;o--)
			{
				System.out.print("*");
			}
			for(p=5;p>=o;p--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
}