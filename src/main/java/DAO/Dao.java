package DAO;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DTO.*;

public class Dao 
{
	
	public static EntityManager getEMEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saurabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	public void insertHospital(Hospital hospital) {

		EntityManager entityManager = getEMEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();

	}

	public void fetchHospital(int id) {
		
		EntityManager entityManager = getEMEntityManager();
		Hospital hospital =   entityManager.find(Hospital.class, id);
		System.out.println(hospital);
		List<Branch> branchs = hospital.getBrachs();
		for (Branch branch : branchs) 
		{
			System.out.println(branch);
		}
		
	}

	public void deleteHospital(int id) {
		EntityManager entityManager = getEMEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Hospital hospital =  entityManager.find(Hospital.class, id);
		
		if (hospital!=null) 
		{
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
		}
		else {
			System.out.println(" Enter correct Id to delete ");
		}
		
	}

	public void updateHospital(int id, Hospital hospital) {
		EntityManager entityManager = getEMEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Hospital hospital2 = entityManager.find(Hospital.class, id);
		hospital2.setId(id);
		hospital2.setBrachs(hospital.getBrachs());
		hospital2.setName("Deccan");
		entityManager.merge(hospital2);
		entityTransaction.commit();
		
	}

}
