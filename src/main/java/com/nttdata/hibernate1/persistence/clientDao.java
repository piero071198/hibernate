package com.nttdata.hibernate1.persistence;

import java.util.List;

public interface clientDao {
	public void insert(client newclient);
	public void update(client updclient);
	public void delete(client delclient);
	
	public client searchById(final Long IdClient);
	public List<client> searchAll();
	public List<client> searchByclientFullName(final String name, final String firstName, final String SecondName);
}
