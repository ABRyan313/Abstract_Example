package abstractExample;

public abstract class Employee {
	
	private String name;
	private int paymentperhour;
	
	
	
	public Employee(String name, int paymentperhour) {
		this.name = name;
		this.paymentperhour = paymentperhour;
	}

	public abstract int calculateSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaymentperhour() {
		return paymentperhour;
	}

	public void setPaymentperhour(int paymentperhour) {
		this.paymentperhour = paymentperhour;
	}
	
	
		
	
}
