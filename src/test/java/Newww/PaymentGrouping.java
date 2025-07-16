package Newww;

import org.testng.annotations.Test;

public class PaymentGrouping 
{
	@Test(priority=1,groups= {"smoke","Regression","functional"})
	void PaymentinRupees()
	{
		System.out.println("Payment in Rupees");
	}
	
	@Test(priority=2,groups= {"smoke","Regression","functional"})
	void PaymentinDollars()
	{
		System.out.println("Payment in Dollars");
	}
	
}
