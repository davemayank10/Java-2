import java.util.Scanner;
class Count{
	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.:");
		int n=sc.nextInt();
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println("total digits:"+count);
	}
}