package withgoldcustomer;

public class VIPCustomer extends Customer{
		
	double salesRatio;
	int agentId;
	
	/*public VIPCustomer() {
		super(0, "no-name");
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
	}*/
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		//System.out.println("VIPCustomer(int, String) call");
	}
	
	@Override
	public int calcPricae(int price) {
		bonusPoint += price * bonusRatio;
		price -= price * salesRatio;
		return price;
	}



	public int getAgentId() {
		return agentId;
	}
}
