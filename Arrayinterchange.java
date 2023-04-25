import java.util.Scanner;
class Arrayinterchange{
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
		System.out.println("interchange first and last element");
		for(int j=0;j<a.length;j++)
		{
			int temp=a[0];
			a[0]=a[n-1];
			a[n-1]=temp;
			System.out.println(a[j]);
		}
	}
}