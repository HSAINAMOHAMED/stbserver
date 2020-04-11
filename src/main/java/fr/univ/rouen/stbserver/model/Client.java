package fr.univ.rouen.stbserver.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "client")
@XmlRootElement
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	@XmlAttribute
	private long id;




	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<Mail> getMail() {
		return mail;
	}

	public void setMail(List<Mail> mail) {
		this.mail = mail;
	}

	public List<Tel> getTel() {
		return tel;
	}

	public void setTel(List<Tel> tel) {
		this.tel = tel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name = "entity", nullable = false, length = 32)
	@XmlAttribute
	private String entity;

	@Column(name = "firstname", nullable = false, length = 32)
	@XmlAttribute
	private String firstname;

	@Column(name = "lastname", nullable = true, length = 32)
	@XmlAttribute
	private String lastname;

	@XmlAttribute
	@OneToMany(mappedBy = "client")
	private List<Mail> mail;
	
	@XmlAttribute
	@OneToMany(mappedBy = "client")
	private List<Tel> tel;
	
	

}
