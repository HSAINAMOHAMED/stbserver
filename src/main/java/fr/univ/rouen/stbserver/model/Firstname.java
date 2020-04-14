package fr.univ.rouen.stbserver.model;
import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "firstname")
@XmlRootElement
public class Firstname implements Serializable{
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
    @GeneratedValue
    private long id;
 
	public Firstname()
	{
		super();
		this.id = 33;
		this.nom = "gg";
		this.gender = Gender.Mme;
		this.lastname = "bb";
		this.mail = "hh";
	}
	
	
    public Firstname(long id, String nom, Gender gender, String lastname, String mail) {
		super();
		this.id = id;
		this.nom = nom;
		this.gender = gender;
		this.lastname = lastname;
		this.mail = mail;
	}

	@XmlElement(name = "nom")
    private String nom;
    

    @XmlAttribute
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @XmlAttribute
    private String lastname;

    @XmlAttribute
    private String mail;


	public void setId(long id) {
		this.id = id;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
    
    
}