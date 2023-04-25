import java.util.Scanner;
class Strong{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.:");
		int n=sc.nextInt();
		int x=n;
		int fact,rem,i,sum=0;
		while(n>0)
		{
			i=1;
			fact=1;
			rem=n%10;
			while(i<=rem)
			{
				fact=fact*i;
				i++;
			}
			System.out.println("the factorial of"+" "+rem+" "+"is"+" "+fact);
			sum=sum+fact;
			n=n/10;
		}
		System.out.println("sum of  no."+" "+x+" "+"is"+" "+sum);
		if(x==sum)
		{
			System.out.println(x+" "+"is strong no.");
		}
		else
		{
			System.out.println(x+" "+"is not strong no.");
		}
	}
}