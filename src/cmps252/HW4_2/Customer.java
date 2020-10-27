package cmps252.HW4_2;

public class Customer {
	public String FirstName;
	public String LastName;
	public String Company;
	public String Address;
	public String City;
	public String County;
	public String State;
	public String ZIP;
	public String Phone;
	public String Fax;
	public String Email;
	public String Web;
	
	public Customer(String firstName, String lastName, String company, String address, String city, String county,
			String state, String zip, String phone, String fax, String email, String web) {
		FirstName = firstName;
		LastName = lastName;
		Company = company;
		Address = address;
		City = city;
		County = county;
		State = state;
		ZIP = zip;
		Phone = phone;
		Fax = fax;
		Email = email;
		Web = web;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public String getCompany() {
		return Company;
	}
	
	public void setCompany(String company) {
		Company = company;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	
	public String getCity() {
		return City;
	}
	
	public void setCity(String city) {
		City = city;
	}
	
	public String getCounty() {
		return County;
	}
	
	public void setCounty(String county) {
		County = county;
	}
	
	public String getState() {
		return State;
	}
	
	public void setState(String state) {
		State = state;
	}
	
	public String getZIP() {
		return ZIP;
	}
	
	public void setZIP(String zip) {
		ZIP = zip;
	}
	
	public String getPhone() {
		return Phone;
	}
	
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	public String getFax() {
		return Fax;
	}
	
	public void setFax(String fax) {
		Fax = fax;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getWeb() {
		return Web;
	}
	
	public void setWeb(String web) {
		Web = web;
	}
}
