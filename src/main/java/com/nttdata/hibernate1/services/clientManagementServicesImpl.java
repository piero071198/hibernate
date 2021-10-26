package com.nttdata.hibernate1.services;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.nttdata.hibernate1.persistence.client;
import com.nttdata.hibernate1.persistence.clientDao;

@Service
public class clientManagementServicesImpl implements clientManagementServices {
	@Autowired
	private clientDao clientDao;
	@Override
	@Transactional
	public void insertNewclient(final client newclient) {
		if(newclient != null && newclient.getIdClient()== null) {
			
			clientDao.insert(newclient);
		}
		
	}
	@Override
	@Transactional
	public void updateNewclient(final client updatedclient) {
		if(updatedclient != null && updatedclient.getIdClient()== null) {
			
			clientDao.update(updatedclient);
		}
		
	}
	@Override
	@Transactional
	public void deleteclient(final client deletedclient) {
		if(deletedclient != null && deletedclient.getIdClient()== null) {
			
			clientDao.delete(deletedclient);
		}
		
	}
	@Override
	@Transactional
	public client searchById(final Long IdClient) {
		client client = null;
		if (IdClient != null) {
			client = clientDao.searchById(IdClient);
			
		}
		return client;
		
	}
	@Override
	@Transactional
	public List<client> searchByclientFullName(final String name, final String firstName, final String SecondName){
		List<client> clientList = new ArrayList<client>();
		if(StringUtils.hasText(name)&&StringUtils.hasText(firstName)&&StringUtils.hasText(SecondName)){
			clientList = clientDao.searchByclientFullName(name,firstName,SecondName);
			
		}
		return clientList;
		
	}
	
	@Override
	@Transactional
	public List<client> searchAll(){
		List<client> clientList = new ArrayList<client>();	
			clientList = clientDao.searchAll();

		return clientList;
		
	}
	
}
