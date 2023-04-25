import java.util.Scanner;
class Bank{
	int acc_no;
	String name;
	double balance;
	Scanner sc=new Scanner(System.in);
	void createAccount()
	{
		
		System.out.println("enter name:");
		name=sc.next();
		System.out.println("enter account no.:");
		acc_no=sc.nextInt();
		System.out.println("enter balance:");
		balance=sc.nextDouble();
	}
	void showDetails()
	{
		System.out.println("Name:"+" "+name);
		System.out.println("Account no.:"+" "+acc_no);
		System.out.println("Balance:"+" "+balance);
	}
	void withdrawal(double wamt)
	{
		
		System.out.println("Withdrawal amount:"+" "+wamt);
		balance=balance-wamt;
		System.out.println("Balance after withdrawing:"+" "+balance);
	}
	void deposit(double damt)
	{
		
		System.out.println("Deposit amount:"+" "+damt);
		balance=balance+damt;
		System.out.println("Balance after depositing:"+" "+balance);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		while(true){
			System.out.println("enter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				b.createAccount();
				break;

			case 2:
				b.showDetails();
				break;

			case 3:
				System.out.println("enter withdrawal amount:");
				double wamt=sc.nextDouble();
				b.withdrawal(wamt);
				break;

			case 4:
				System.out.println("enter deposit amount:");
				double damt=sc.nextDouble();
				b.deposit(damt);
				break;

			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}
}