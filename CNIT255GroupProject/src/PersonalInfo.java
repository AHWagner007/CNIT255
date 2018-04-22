/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3williamrao;

/**
 *
 * @author Will
 */
public class PersonalInfo {
    public class info {
	String email;
	String firstname;
	String lastname;
	String age;
	String streetAddress;
    	String streetAddress2;
    	String city;
    	String state;
    	String zipCode;
   	String country;

	
	public void infos(String first, String last, String em, String ag, String add1, String add2, String zip, String city1, String state1, String country1)
	{
		add1 = streetAddress;
        		add2 = streetAddress2;
        		city1 = city;
        		state1 = state;
        		zip =zipCode;
        		country1 = country;
		ag = age;
		em = email;
		first = firstname;
		last = lastname;
	}

	 public String getStreetAddress()
    	{
       		 return streetAddress;
    	}

   	 public void setStreetAddress(String add1)
   	 {
        	add1 = streetAddress;
   	 }
    	public String getStreetAddress2()
    	{
       	 return streetAddress2;
   	 }

   	 public void setStreetAddress2(String add2)
    	{
        	add2 = streetAddress2;
    	}
    	public String getCity()
    	{
      	  return city;
   	 }
    	public void setCity(String city1)
    	{
        	city1 = city;
  	  }
   	 public String getState()
    	{
       	 return state;
    	}
   	 public void setState(String state1)
    	{
        	state1 = state;
  	  }
    	public String getZipCode()
    	{
     	   return zipCode;
   	 }
    	public void setZipCode(String zip)
   	 {
        	zip = zipCode;
    	}
    	public String getCountry()
    	{
       	 return country;
  	  }
    	public void setCountry(String country1)
    	{
        	country1 = country;
    	}

	public String getLastName()
    	{
       	 return lastname;
    	}
    	public void setLastName(String last)
    	{
        	lastname = last;
    	}

    	public String getFirstName()
   	 {
        	return firstname;
   	 }
    	public void setFirstName(String first)
    	{
       	 firstname = first;
    	}
	public String getEmail()
	{
	return email;
	}
	public void setEmail(String em)
	{
	email = em;
	}
	
	public String getAge()
	{
	return age;
	}
	
	public void setAge(String ag)
	{
	age= ag;
	}
}
	

}
