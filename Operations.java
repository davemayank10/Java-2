import java.util.Scanner;
class Operations{
	
	void reverse(int n)
	{
		
		int rem,rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse:"+rev);
		
	}

	void factorial(int n)
	{
		int f=1;
		int i=1;
		
		while(i<=n)
		{
			 f=f*i;
			 i++;			
		}
		System.out.println("factorial:"+f);
	
	}

	void prime(int n)
	{
		int count=0,i=2;
		boolean flag=true;
		
		while(i<=n/2)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
			i++;
		}
		if(flag==true){
		System.out.println(n+" "+"is prime no.");
		}
		else
		{
			System.out.println(n+" "+"is not prime no.");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Operations obj=new Operations();
		Operations obj1=new Operations();
		Operations obj2=new Operations();
		while(true)
		{
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter no.:");
				int n=sc.nextInt();
				obj.reverse(n);
				break;

			case 2:
				System.out.println("enter no.:");
				n=sc.nextInt();
				obj1.factorial(n);
				break;

			case 3:
				System.out.println("enter no.:");
				n=sc.nextInt();
				obj2.prime(n);
				break;

			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("invalid input:");
				break;
			}
		}
	}
}