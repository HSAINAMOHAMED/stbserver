package fr.univ.rouen.stbserver.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
@Table(name = "stb")
@XmlRootElement
public class STB implements Serializable {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	public int id;
	public STB()
	{
		
	}
	public STB(int id, String title, int version, String date, String descr, Client client, Team team, Detail detail) {
		super();
		this.id = id;
		this.title = title;
		this.version = version;
		this.date = date;
		this.descr = descr;
		this.client = client;
		this.team = team;
		this.detail = detail;
	}

	@XmlElement(name = "titre")
	public String title;

	@XmlElement(name = "version")
	public int version;

	@XmlElement(name = "date")
	public String date;

	@XmlElement(name = "descr")
	public String descr;

	
	@OneToOne
	@XmlElement(name = "client", required = true)
	private Client client;

	
	@OneToOne
	@XmlElement(name = "team", required = true)
	private Team team;
	
	@OneToOne
	@XmlElement(name = "detail", required = true)
	private Detail detail;


	

	
	@Override
	public String toString() {
		return "STB [id=" + id + ", title=" + title + ", version=" + version + ", date=" + date + ", descr=" + descr
				+ ", team=" + team + ", detail=" + detail + "]";
	}

	
}