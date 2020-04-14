package fr.univ.rouen.stbserver.model;
import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
 
   


	@XmlElementWrapper(name = "functionalites_Projet")
    @XmlElement(name = "functionalite_Projet")
    @OneToMany(mappedBy="feature")
	private List<functionaliteProjet> functionaliteProjet;
    
    

	@XmlElement(name = "section",required=true)
    private int section;
    
    @XmlElement(name = "number",required=true)
    private int number;
    
    @XmlElement(name = "decription",required=true)
    private String decription;
    

    @XmlElement(name = "priority",required=true)
    private int priority;
    
    @XmlElement(name = "delivery",required=true)
    private String delivery;
    
    
    
    
}