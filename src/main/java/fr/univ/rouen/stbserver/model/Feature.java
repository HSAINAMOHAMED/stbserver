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
import javax.persistence.Table;

@Entity
@Table(name = "feature")
@XmlRootElement
public class Feature implements Serializable{
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
    @GeneratedValue
    @XmlAttribute(name = "id")
    private long id;
 
   

	public List<functionaliteProjet> getFunctionaliteProjet() {
		return functionaliteProjet;
	}

	public void setFunctionaliteProjet(List<functionaliteProjet> functionaliteProjet) {
		this.functionaliteProjet = functionaliteProjet;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@XmlAttribute
    @OneToMany(mappedBy="feature")
	private List<functionaliteProjet> functionaliteProjet;
    
    

    @XmlAttribute(name = "section",required=true)
    private int section;
    
    @XmlAttribute(name = "number",required=true)
    private int number;
    
    @XmlAttribute(name = "decription",required=true)
    private String decription;
    

    @XmlAttribute(name = "priority",required=true)
    private int priority;
    
    @XmlAttribute(name = "delivery",required=true)
    private String delivery;
    
    
    
    
}
