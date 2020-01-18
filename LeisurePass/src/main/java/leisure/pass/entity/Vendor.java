package leisure.pass.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendor {
	
	@Id
	private String vendorId;

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + "]";
	}

	
	
	
	
}
