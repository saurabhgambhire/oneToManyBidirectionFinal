package DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	private int id;
	private String name;
	private String country;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Branch> brachs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	

	public List<Branch> getBrachs() {
		return brachs;
	}

	public void setBrachs(List<Branch> brachs) {
		this.brachs = brachs;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", country=" + country +  "]";
	}

}
