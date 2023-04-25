import java. util. Scanner;
class Fact{
	public static void main(String[] args) {
		int f=1;
		int i=1;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no.:");
		int n=sc.nextInt();
		while(i<=n)
		{
			 f=f*i;
			 i++;			
		}
		System.out.println("factorial:"+f);
	}
}