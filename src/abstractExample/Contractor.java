package abstractExample;

public class Contractor extends Employee {
	
	private int workinghours;

	public Contractor(String name, int paymentperhour, int workinghours) {
		super(name, paymentperhour);
		this.workinghours = workinghours;
	}
	
	

	@Override
	public int calculateSalary() {
		return getPaymentperhour() * workinghours;
	}

}
