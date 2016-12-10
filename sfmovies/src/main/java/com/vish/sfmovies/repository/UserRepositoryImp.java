package com.vish.sfmovies.repository;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import com.vish.sfmovies.entity.UserDetails;

@Repository
public class UserRepositoryImp implements UserRepository {	
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public UserDetails findOne(String id) {
		return em.find(UserDetails.class, id);
	}

	@Override
	public UserDetails create(UserDetails uUserDetails) {
		em.persist(uUserDetails);
		return uUserDetails;
	}

	@Override
	public UserDetails update(UserDetails uUserDetails) {
		return em.merge(uUserDetails);
	}

	@Override
	public void delete(UserDetails uUserDetails) {
		em.remove(uUserDetails);		
	}

}
