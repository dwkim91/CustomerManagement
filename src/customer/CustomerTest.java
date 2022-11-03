package customer;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "Lee");
		customerLee.bonusPoint = 1000;
		int priceLee = customerLee.calcPricae(1000);
		System.out.println(customerLee.showCustomerInfo() +" 지불금액은 " + priceLee + "원 입니다.");
		
		VIPCustomer customerKim = new VIPCustomer(10020, "Kim");
		customerKim.bonusPoint = 10000;
		int priceKim = customerKim.calcPricae(1000);
		System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + "원 입니다.");
		
		Customer vc = new VIPCustomer(15000, "Park");	
		vc.bonusPoint = 10000;
		int priceVC = vc.calcPricae(1000);
		System.out.println(vc.showCustomerInfo() + " 지불금액은 " + priceVC  + "원 입니다.");

		
	}

}
