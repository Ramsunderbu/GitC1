package org.bank;

public class AxisBank extends BankInfo{
	
	@Override
	public void deposite() {
		System.out.println("Deposite:15%");
		super.deposite();
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.deposite();
		a.savings();
		a.fixed();
	}

}
