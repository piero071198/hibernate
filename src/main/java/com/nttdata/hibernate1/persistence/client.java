package com.nttdata.hibernate1.persistence;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "client")
public class client {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "IdClient", nullable=false)
	private Long IdClient;
	@Column(name = "name", nullable=false)
    private String name;
	@Column(name = "firstName", nullable=false)
	private String firstName;
	@Column(name = "SecondName", nullable=false)
	private String SecondName;
	@Column(name = "DocumentoDeINDENTIDAD", nullable=false, length=9,unique=true)
	private String DocumentoDeINDENTIDAD;
	public Long getIdClient() {
		return IdClient;
	}
	public void setIdClient(Long idClient) {
		IdClient = idClient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return SecondName;
	}
	public void setSecondName(String secondName) {
		SecondName = secondName;
	}
	public String getDocumentoDeINDENTIDAD() {
		return DocumentoDeINDENTIDAD;
	}
	public void setDocumentoDeINDENTIDAD(String documentoDeINDENTIDAD) {
		DocumentoDeINDENTIDAD = documentoDeINDENTIDAD;
	}
	
}
