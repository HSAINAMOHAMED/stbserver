package fr.univ.rouen.stbserver.model;
import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "functionaliteProjet")
@XmlRootElement(name="functionaliteProjet")
public class functionaliteProjet implements Serializable{
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
    @GeneratedValue
    @XmlAttribute(name = "id")
    private long id;
 
	
	@XmlElement(name = "functionalite",required=true)
    private String functionalite;
    
    @ManyToOne
    private Feature feature;

	

    
    
    
}