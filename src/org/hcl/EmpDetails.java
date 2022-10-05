package org.hcl;

public class EmpDetails {

	private void empName() {
		System.out.println("ram");
	}

	private void empAge() {
		System.out.println("age : 25");
	}

	public static void main(String[] args) {
		EmpDetails e = new EmpDetails();
		e.empName();
		e.empAge();
	}
}
