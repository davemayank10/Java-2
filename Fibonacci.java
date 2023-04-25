import java.util.Scanner;
class Fibonacci{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,i=1,sum;
		System.out.println("enter range:");
		int range=sc.nextInt();
		System.out.print(a+" "+b+" ");
		while(i<=range)
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			i++;
		}

	}
}