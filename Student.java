package com.springframework.dependencychecking.objects.applicationcontext;

/* 2. Objects :
                 If you set dependency checking to object then it is mandatory to call secondary types setter methods.
                       Program for dependency checking using objects. */

public class Student {

	private String firstName;
	private Address address; // Secondary DataType

	// Use Getter & Setter

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// Use toString Method

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", address=" + address + "]";
	}

	// Create Method
	public void getStudent() {

		System.out.println("First Name > " + firstName);
		System.out.println("Address > " + address.getAddressLine());

	}

}
