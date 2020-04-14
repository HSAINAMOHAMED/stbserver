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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person")
@XmlRootElement
public class Person implements Serializable{
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
    @GeneratedValue
    @XmlElement(name = "id")
    private long id;
    
    @OneToOne
    @XmlElement(name = "firstname")
	private Firstname firstname;
    
    
    @XmlElementWrapper(name = "functions")
    @XmlElement(name = "function")
    @OneToMany(mappedBy="person")
	private List<Function> function;
    
    
    @ManyToOne
    private Team team;





}