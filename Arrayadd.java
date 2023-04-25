import java.util.Scanner;
class Arrayadd{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter total no. of elements you want to add:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements:");
		for (int i=0;i<a.length ;i++ ) {
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length;j++)
		{
			sum=sum+a[j];
		}
		System.out.println("sum:"+" "+sum);
	}
}