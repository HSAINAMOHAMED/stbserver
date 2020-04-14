package fr.univ.rouen.stbserver.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@XmlRootElement(name="STB")
public class stbResume implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	@XmlElement
	private String title;

	@XmlElement
	private int version;

	@XmlElement
	private String date;

	@XmlElement
	private String descr;

	public stbResume(int id,String title,int version,String date,String descr)
	{
		this.id=id;
		this.title=title;
		this.version=version;
		this.descr=descr;
		this.date=date;
	}
	
	

	
}