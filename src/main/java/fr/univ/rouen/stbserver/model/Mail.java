package fr.univ.rouen.stbserver.model;
import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
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
@Table(name = "mail")
@XmlRootElement
public class Mail implements Serializable{
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
    @GeneratedValue
    @XmlAttribute(name = "id")
    private long id;
 
   

	@XmlAttribute(name = "mail",required=true)
    private String mail;
    
    @ManyToOne
    @XmlAttribute(name = "client",required=true)
    private Client client;

	

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}