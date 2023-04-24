package contact;

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}
		
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid fist name");
		}
		
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	public String getID() {
		return contactID;
	}
	
	public String getFirst() {
		return firstName;
	}
	
	public String getLast() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setFirst(String begName) {
		if (begName == null || begName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = begName;
	}
	
	public void setLast(String endName) {
		if (endName == null || endName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = endName;
	}
	
	public void setPhone(String newPhone) {
		if (newPhone == null || newPhone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		this.phone = newPhone;
	}
	
	public void setAddress(String newAddress) {
		if (newAddress == null || newAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = newAddress;
	}

}


