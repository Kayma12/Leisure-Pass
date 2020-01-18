package leisure.pass.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;




@Entity
public class Customer {
	
	@Id
	private String customerId;
	private String firstName;
	private String lastName;
	private String homeCity;
	
	
	@OneToMany(targetEntity=Pass.class, mappedBy="customer",cascade=CascadeType.ALL, fetch = FetchType.LAZY)    
	private List<Pass> passes = new ArrayList<>();
	
	 public List<Pass> getlistOfPasses() {
	        return passes;
	        
	    }
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
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
	public String getHomeCity() {
		return homeCity;
	}
	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", homeCity=" + homeCity + "]";
	}
	
	
	
	

}
