package com.nttdata.hibernate1.services;
import java.util.List;

import com.nttdata.hibernate1.persistence.client;

public interface clientManagementServices {
	public void insertNewclient(final client newclient);
	public void updateNewclient(final client updateclient);
	public void deleteclient(final client deletedclient);
	public client searchById(final Long IdClient);
	public List<client> searchByclientFullName(final String name, final String firstName, final String SecondName);
	public List<client> searchAll();
}
