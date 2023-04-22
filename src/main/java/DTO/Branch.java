package DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Branch {
	@Id
	private int id;
	private String branchName;
	private int pincode;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Hospital> hospitals;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public List<Hospital> getHospitals() {
		return hospitals;
	}

	public void setHospitals(List<Hospital> hospitals) {
		this.hospitals = hospitals;
	}

	@Override
	public String toString() {
		return "Branch [id=" + id + ", branchName=" + branchName + ", pincode=" + pincode + ", hospitals=" + hospitals
				+ "]";
	}

}
