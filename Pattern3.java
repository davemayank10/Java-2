class Pattern3{
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter rows:");
		int r=sc.nextInt();
		System.out.println("enter columns:");
		int c=sc.nextInt();*/
		int row=1;
		while(row<=5)
		{
			int column=1;
			while(column<=row)
			{
				System.out.print("*"+" ");
				column++;
			}
			//column--;
			System.out.println();
			row++;
		}
}
}