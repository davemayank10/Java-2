class Swap{
	public static void main(String[] args) {
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		System.out.println("before swapping"+" "+a+" "+b);
		double c=a;
		a=b;
		b=c;
		System.out.println("after swapping"+" "+a+" "+b);
	}
}