package PS3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testAccountPS3 {
	@Test
	
	public void testWithdraw(){
		Account balance = new Account(1122, 20000);
		assertEquals(balance.withdraw(2500), 17500, .01);
	}
	
	@Test
	public void testDeposit(){
		Account balance = new Account(1122,20000);
		assertEquals(balance.deposit(3000),23000,.01);
	}
	
	@Test
	public void testAccount(){
		Account balance = new Account(1122,20000);
		assertEquals(balance.withdraw(2500),17500,.01);
		assertEquals(balance.deposit(3000),20500,.01);
		assertEquals(balance.getMonthlyInterestRate(4.5),.375,.01);
		
		System.out.println(balance.getBalance());
		System.out.println(balance.getMonthlyInterestRate(4.5));
		System.out.println(balance.getDateCreate());	
	}
	@Test
	public void InsufficientFundsException(){
		Account balance = new Account(1122,20000);
		assertEquals(balance.withdraw(2500),600,.01);	
	}
}
