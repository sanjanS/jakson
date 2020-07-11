package com.wbl;

	/**
	 * @author kanpuri
	 * This is patient model class.
	 */

	public class Patient {

	  private String firstName;
	  private String lastName;
	  private String dateOfBirth;
	  private String address;
	  private String city;
	  private String state;
	  private String zip;
	  private String phone;
	  
	  public String getFirstName() {
	    return firstName;
	  }
	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }
	  public String getLastName() {
	    return lastName;
	  }
	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }
	  public String getDateOfBirth() {
	    return dateOfBirth;
	  }
	  public void setDateOfBirth(String dateOfBirth) {
	    this.dateOfBirth = dateOfBirth;
	  }
	  public String getAddress() {
	    return address;
	  }
	  public void setAddress(String address) {
	    this.address = address;
	  }
	  public String getCity() {
	    return city;
	  }
	  public void setCity(String city) {
	    this.city = city;
	  }
	  public String getState() {
	    return state;
	  }
	  public void setState(String state) {
	    this.state = state;
	  }
	  public String getZip() {
	    return zip;
	  }
	  public void setZip(String zip) {
	    this.zip = zip;
	  }
	  public String getPhone() {
	    return phone;
	  }
	  public void setPhone(String phone) {
	    this.phone = phone;
	  }
	  @Override
	  public String toString() {
			return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
					+ ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phone=" + phone
					+ "]";
	  }
}
