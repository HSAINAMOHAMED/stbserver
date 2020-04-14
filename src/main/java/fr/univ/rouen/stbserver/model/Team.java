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
import javax.persistence.Table;

@Entity
@Table(name = "team")
@XmlRootElement
public class Team implements Serializable{
 
    @Id 
    @GeneratedValue
    @Column(name = "id")
    private long id;

    
   
    @XmlElementWrapper(name = "persons")
    @XmlElement(name = "person")
    @OneToMany(mappedBy="team")
	private List<Person> person;


	

    
}