import java.util.Scanner;
class Arraysearch{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter total no. of elements you want to add:");
		int n=sc.nextInt();
		int a[]=new int[n];
		boolean flag=false;
		System.out.println("enter elements:");
		for (int i=0;i<a.length ;i++ ) {
			a[i]=sc.nextInt();
		}
		System.out.println("array elements");
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		System.out.println("enter element to search:");
		int s=sc.nextInt();
		for(int k=0;k<a.length;k++)
		{
			if(s==a[k])
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(s+" "+"found");
		}
		else
		{
			System.out.println(s+" "+"not found");
		}
	}
}