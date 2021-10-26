package com.nttdata.hibernate1.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class clientDaoImpl implements clientDao {
	@Autowired
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void insert(client newclient) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(newclient);
		currentSession.close();
	}
	@Override
	@Transactional
	public void update(final client updclient) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(updclient);
		currentSession.close();
	}
	@Override
	@Transactional
	public void delete(client delclient) {
		delclient = entityManager.merge(delclient);
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(delclient);
		currentSession.close();
	}
	
	@Override
	@Transactional
	public client searchById(final Long IdClient) {
		Session currentSession = entityManager.unwrap(Session.class);
		client result = currentSession.get(client.class, IdClient);
			currentSession.clear();
			return result;
		
	}
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<client> searchAll(){
		Session currentSession = entityManager.unwrap(Session.class);
		List<client> list = currentSession.createQuery("fROM client").list();
		currentSession.close();
		return list;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<client> searchByclientFullName(final String name, final String firstName, final String SecondName){
		Session currentSession = entityManager.unwrap(Session.class);
		final List<client> clientList = currentSession.createQuery("FROM client where name='" + name + "' AND firstName='"+firstName+"'AND SecondName'"+SecondName+"'").list();
		return clientList;
	}
	
	
}
