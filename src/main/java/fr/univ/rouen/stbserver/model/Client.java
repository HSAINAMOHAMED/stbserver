package fr.univ.rouen.stbserver.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
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
	private long id;


	@XmlElement(name = "entity")
	private String entity;

	@XmlElement(name = "firstname")
	private String firstname;

	@XmlElement(name = "lastname")
	private String lastname;

	@XmlElement
	@OneToMany(mappedBy = "client")
	private List<Mail> mail;
	
	@XmlElementWrapper(name = "tels")
    @XmlElement(name = "tel")
	@OneToMany(mappedBy = "client")
	private List<Tel> tel;
	
	

}