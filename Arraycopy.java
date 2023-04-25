import java.util.Scanner;
class Arraycopy{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter total no. of elements you want to add:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("enter elements:");
		for (int i=0;i<a.length ;i++ ) {
			a[i]=sc.nextInt();
		}
		System.out.println("array elements");
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		System.out.println("copy array");
		for(int k=0;k<a.length;k++)
		{
			b[k]=a[k]*a[k];
			System.out.println(b[k]);
		}

	}
}