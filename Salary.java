class Salary{
	public static void main(String[] args) {
		double s=Double.parseDouble(args[0]);    //input
		System.out.println("salary"+" "+s);    //output
		int y=Integer.parseInt(args[1]);    //input
		System.out.println("exp.year:"+" "+y);    //output
		if(y>=10)                 			//if...else condition
		{
			//double sl=s+5000;
			//System.out.println("increased salary:"+" "+sl);
			double sl=(s*.20);
			System.out.println("increased by 20%:"+" "+sl); //salary increased by 20%
			double i=s+sl;
			System.out.println("increased salary:"+" "+i); //increased salary
		}
		else{
			System.out.println(s);
		}
	}
}