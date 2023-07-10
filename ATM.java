package in.VijayaBank;

import java.util.Scanner;

class ATMFunctions
{
	String name;
	int pin;
	int balance=0;
	String transaction;
	Scanner scan=new Scanner(System.in);
	public void register()
	{
		System.out.println("Enter userId:");
		name=scan.next();
		System.out.println("Enter pin:");
		pin=scan.nextInt();
		System.out.println(".....registered Successfully.....");
		
		System.out.println("Add some balance to your account:");
		balance=scan.nextInt();
		
		System.out.println("currrent balance:"+balance);
		transaction=balance+" added to account\n";
		
	}
	public void withDraw()
	{
		int a;
		System.out.println("Enter a amount to withdraw:");
		a=scan.nextInt();
		if(a<=balance)
		{
		this.balance=balance-a;
		System.out.println("Amount "+a+" withdrawn sucessfully...");
		System.out.println("current balance:"+balance);
		
		this.transaction=transaction.concat("Amount "+a+" withdrawn from account\n");
		}
		else
		{
			System.out.println("Transaction Declined");
		}
		
	}
	public void deposit()
	{
		int b;
		System.out.println("Enter a amount to deposit:");
		b=scan.nextInt();
		this.balance=balance+b;
		System.out.println("Amount "+b+" is deposited sucessfully...");
		System.out.println("current balance:"+balance);
		
		this.transaction=transaction.concat("Amount "+b+" deposited into your account\n");
		
	}
	public void transfer()
	{
		System.out.println("enter the userid to trasfer:");
		String userid=scan.next();
		System.out.println("enter the amount to transfer:");
		int c=scan.nextInt();
		this.balance=balance-c;
		System.out.println("current balance:"+balance);
		
		this.transaction=transaction.concat("Amount "+c+" tranfered to "+userid+" account\n");
		
	}
	public void checkBalance()
	{
		System.out.println("balance:"+balance);
	}
	public void transactionHistory()
	{
		System.out.println("Transaction History:\n"+transaction);
	}
}
public class ATM {

	public static void main(String[] args) {
		
		int option;
		Scanner scan=new Scanner(System.in);
		ATMFunctions atm=new ATMFunctions();
		atm.register();
		System.out.println();
		boolean flag=true;
		
		while(true)
		{
		System.out.println("........Basic ATM Operations.........");
			
		System.out.println("Enter 1 : Withdraw \n Enter 2 : Deposit\nEnter 3 : Transfer\nEnter 4 : CheckBalance\nEnter 5 : Transaction History\nEnter 6 : Exit\n");
		option=scan.nextInt();
		if(option==1)
		{
			atm.withDraw();
		}
		if(option==2)
		{
			atm.deposit();
		}
		if(option==3)
		{
			atm.transfer();
		}
		if(option==4)
		{
			atm.checkBalance();
		}
		if(option==5)
		{
			atm.transactionHistory();
		}
		if(option==6)
		{
			System.exit(0);
		}
		
		}

	}

}
