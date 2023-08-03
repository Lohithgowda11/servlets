package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.UserDTO;

public class UserDAO
{
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev"); 
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	public void save(UserDTO dto)
	{
		transaction.begin();
		manager.persist(dto);
		transaction.commit();
	}
	
	public UserDTO login(long mob) {
		// TODO Auto-generated method stub
		return manager.find(UserDTO.class, mob);
	}
	
	public UserDTO login(String email)
	{
		List<UserDTO> list = manager.createQuery("select x from UserDTO x where email=?1").setParameter(1, email).getResultList();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
	}
	
	public List<UserDTO> fetchAll()
	{
		return manager.createQuery("select x from UserDTO x").getResultList();
	}
	
	public UserDTO find(long mob)
	{
		return manager.find(UserDTO.class, mob);
	}
	
	public void delete(UserDTO userDTO)
	{
		transaction.begin();
		manager.remove(userDTO);
		transaction.commit();
	}
	
	public void update(UserDTO userDTO)
	{
		transaction.begin();
		manager.merge(userDTO);
		transaction.commit();
	}

	
}
