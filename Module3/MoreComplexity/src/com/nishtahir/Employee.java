package com.nishtahir;

import com.nishtahir.Address.Builder;

public class Employee {

	private String firstName;
	private String lastName;
	private long idNumber;
	private String department;

	private Address address;

	public Employee(String firstName, String lastName, long idNumber, String department, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.department = department;
		this.address = address;
	}

	public static class Builder {
		private String firstName;
		private String lastName;
		private long idNumber;
		private String department;

		private Address address;

		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder withIdNumber(long idNumber) {
			this.idNumber = idNumber;
			return this;
		}

		public Builder withDepartment(String department) {
			this.department = department;
			return this;
		}

		public Builder withAddress(Address address) {
			this.address = address;
			return this;
		}

		public Employee create() {
			return new Employee(firstName, lastName, idNumber, department, address);
		}
	}
}
