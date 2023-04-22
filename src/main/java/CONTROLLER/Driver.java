package CONTROLLER;

import java.util.ArrayList;
import java.util.List;

import DAO.Dao;
import DTO.*;

public class Driver 
{
	public static void main(String[] args) 
	{
		Branch branch = new Branch();
		branch.setId(1);
		branch.setBranchName("Deccan");
		branch.setPincode(414402);
		
		
		Branch branch2 = new Branch();
		branch2.setId(2);
		branch2.setBranchName("Hadapsar");
		branch2.setPincode(413305);
		
		Branch branch3 = new Branch();
		branch3.setId(3);
		branch3.setBranchName("Hinjewadi");
		branch3.setPincode(410098);
		
		List<Branch> branchs = new ArrayList<Branch>();
		branchs.add(branch);
		branchs.add(branch2);
		branchs.add(branch3);
		
		
		Hospital hospital = new Hospital();
		hospital.setId(1);
		hospital.setName("Qspiders");
		hospital.setCountry("India");
		hospital.setBrachs(branchs);
		
		
		
		Dao dao = new Dao();
		
//		dao.insertHospital(hospital);
//		dao.fetchHospital(1);
//		dao.deleteHospital(1);
		dao.updateHospital(1,hospital);
		
		
	}

}
