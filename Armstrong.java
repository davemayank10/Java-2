import java.util.Scanner;
class Armstrong{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rem,result=0,count=0;
		System.out.println("enter 3 digit no.:");
		int n=sc.nextInt();
		int original=n;
		int x=n;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println("digits:"+count);

		while(x!=0)
		{
			rem=x%10;
			result+=Math.pow(rem,count);
			System.out.println(result);
			x=x/10;
		}
		if(result==original)
		{
			System.out.println("Armstrong no.");
		}
		else
		{
			System.out.println("not Armstrong no.");
		}
	}
}