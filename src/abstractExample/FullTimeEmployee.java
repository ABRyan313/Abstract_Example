package abstractExample;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String name, int paymentperhour) {
		super(name, paymentperhour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateSalary() {
		return getPaymentperhour() * 8;
	}
	
	

}
