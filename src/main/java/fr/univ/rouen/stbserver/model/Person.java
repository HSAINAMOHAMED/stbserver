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
    @XmlAttribute(name = "id")
    private long id;
    
    @OneToOne
	@XmlAttribute(name = "firstname")
	private Firstname firstname;
    
    
    @XmlAttribute
    @OneToMany(mappedBy="person")
	private List<Function> function;
    
    
    @ManyToOne
    @XmlAttribute(name = "team",required=true)
    private Team team;





	public Firstname getFirstname() {
		return firstname;
	}


	public void setFirstname(Firstname firstname) {
		this.firstname = firstname;
	}


	public List<Function> getFunction() {
		return function;
	}


	public void setFunction(List<Function> function) {
		this.function = function;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
}
