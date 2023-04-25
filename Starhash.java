class Starhash{
	public static void main(String[] args) {
		int row=1;
		while(row<=5)
		{
			int column=1;
			while(column<=row)
			{
				if(row%2==0)
				{
					System.out.print("#"+" ");
				}
				else
				{
					System.out.print("*"+" ");
				}
				column++;
			}
			System.out.println();
			row++;
		}		
	}
}