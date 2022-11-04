package withgoldcustomer;

public class GOLDCustomer extends Customer{
	
	double salesRatio;
	
	public GOLDCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		salesRatio = 0.1;
		bonusRatio = 0.02;
		customerGrade = "GOLD";
	}
	
	
	
	@Override
	public int calcPricae(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

}
