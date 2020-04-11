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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stb")
@XmlRootElement
public class STB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@XmlAttribute(name = "id")
	private int id;

	@XmlAttribute(name = "titre")
	private String title;

	@XmlAttribute(name = "version")
	private int version;

	@XmlAttribute(name = "date")
	private String date;

	@XmlAttribute(name = "descr")
	private String descr;

	
	@OneToOne
	@XmlAttribute(name = "client", required = true)
	private Client client;

	
	@OneToOne
	@XmlAttribute(name = "team", required = true)
	private Team team;
	
	@OneToOne
	@XmlAttribute(name = "detail", required = true)
	private Detail detail;

	
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
/*
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Detail getDetail() {
		return detail;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
*/
	@Override
	public String toString() {
		return "STB [id=" + id + ", title=" + title + ", version=" + version + ", date=" + date + ", descr=" + descr
				+ ", team=" + team + ", detail=" + detail + "]";
	}

	
}
