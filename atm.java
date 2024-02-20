package codesoft;
import java.util.*;
class bank
{
	Scanner scan=new Scanner(System.in);
	private static int bankbalance=1000000;
	public void checkbankbalance()
	{
		System.out.println("enter your pin number");
		int pin=scan.nextInt();
		System.out.println("Available Balance fetched successfully");
		System.out.println(bankbalance);
		
	}
	public void deposit()
	{
		System.out.print("enter the amount to depoist:");
		int storeamount=scan.nextInt();
		bankbalance=bankbalance+storeamount;
		System.out.println("your available balance is: "+bankbalance);
	
	}
	public void withdraw()
	{
		System.out.print("Enter the amount to withdraw:");
		int retriveamount=scan.nextInt();
		if(retriveamount<=bankbalance)
		{
			System.out.println("Please take your cash:"+retriveamount);
		}
		else
		{
			System.out.println("Insuffecient bank balance");
		}
	}
	public void exit()
	{
		System.out.println("Please remove your card");
		System.out.println("Thank you!");
	}
	void option()
    {
    	
    System.out.println("              "+"Select your service"+"      ");
	System.out.println("1:Checkbankbalence"+ "           "+"2:Deposit");
	System.out.println("3:Withdraw"+"                   "+"4:exit");
	System.out.println("enter service number you want to perform");
	}
}
public class atm {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please insert your card");
	    System.out.println("Welcome!");
	    bank b=new bank();
		while(true) 
		{
		b.option();
        int selectyourservice=scan.nextInt();
        
        if(selectyourservice==1)
          {
    
          	b.checkbankbalance();
          	
          }
          else if(selectyourservice==2)
          {
          	b.deposit();
          	
          }
          else if(selectyourservice==3)
          {
          	b.withdraw();
          	
         }
          else if(selectyourservice>=5)
          {
             System.out.println("you entered wrong option please provide correct option");
           }
          else
          {
        	  b.exit();
        	  break;
        }
     }
	}
	}
        

	
