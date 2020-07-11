package com.wbl;

public class Employee {
	  private String firstName;
	  private String lastName;
	  private String dateOfBirth;
	  private String address;
	  private String city;
	  private String state;

	  /**
	   * @param getfirstname
	   * @return firstName
	   **/
	  public String getFirstName() {
	    return firstName;
	  }
	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }
	  /**
	   * @param getlastName
	   * @return lastName
	   **/
	  public String getLastName() {
	    return lastName;
	  }
	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }
	  /**
	   * @param getdateOfBirth
	   * @return dateOfBirth
	   **/
	  public String getDateOfBirth() {
	    return dateOfBirth;
	  }
	  public void setDateOfBirth(String dateOfBirth) {
	    this.dateOfBirth = dateOfBirth;
	  }
	  /**
	   * @param getAddress
	   * @return address
	   **/
	  public String getAddress() {
	    return address;
	  }
	  public void setAddress(String address) {
	    this.address = address;
	  }
	  /**
	   * @param getCity
	   * @return city
	   **/
	  public String getCity() {
	    return city;
	  }
	  public void setCity(String city) {
	    this.city = city;
	  }
	  /**
	   * @param getState
	   * @return state
	   **/
	  public String getState() {
	    return state;
	  }
	  public void setState(String state) {
	    this.state = state;
	  }
	  @Override
	  public String toString() {
	    return "Employee [firstName=" + firstName 
	    		+ ", LastName=" + lastName + ", dateOfBirth="
	    		+ dateOfBirth + ", address=" + address 
	    		+ ", city=" + city + ", state=" + state + "]";
	  }
}
