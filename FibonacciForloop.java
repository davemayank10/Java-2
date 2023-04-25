import java.util.Scanner;
class FibonacciForloop{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int f;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=n;i++)
		{
			 f=a+b;
			System.out.print(f+" ");
			a=b;
			b=f;
		}
	}
}