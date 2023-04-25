import java.util.Scanner;
class Arrayreverse{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total no. of elements you want to add:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int rem,rev=0;
		System.out.println("enter elements:");
		for (int i=0;i<a.length ;i++ ) {
			a[i]=sc.nextInt();
		}
		System.out.println("reverse array");
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.println(a[j]);
		}
		
	}
}