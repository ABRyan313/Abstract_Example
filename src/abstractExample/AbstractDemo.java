package abstractExample;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Employee contractor = new Contractor("Saale Harami", 10, 10);
		Employee fullTimeEmployee = new FullTimeEmployee("Jamal Kudu", 8);
		System.out.println("Salary of the contractor" + " " + "$"+contractor.calculateSalary());
		System.out.println("Salary of the full time employee" + " " + "$"+fullTimeEmployee.calculateSalary());

	}

}
