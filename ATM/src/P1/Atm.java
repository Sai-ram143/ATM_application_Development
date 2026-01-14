package P1;

import java.util.Scanner;

public class Atm
{

	public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);
        int bal=2000;
        int count=0;
   while(true)
     {
		System.out.println("Enter pin number");
		int pin=s.nextInt();
		count++;
		if(pin == 1111 || pin == 2222 || pin == 3333 )
		{
			System.out.println("Enter the amount");
			int wd=s.nextInt();
			
			if(wd >bal)
			{
				System.out.println("Amount is not sufficient");
			    break;
			}
			else
			{
				System.out.println("Withdraw amount:"+wd);
				System.out.println("Remaining Balance:"+(bal-wd));
			}
		}

		if(count==3)
		{
			System.out.println("MAX.COUNT REACHED");
		       
		} 
		
   } //while loop

	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}

}
