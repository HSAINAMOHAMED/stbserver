package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "STB")
@XmlAccessorType(XmlAccessType.NONE)
public class STB implements Serializable {
	private static final long serialVersionUID = 1L;
	@XmlAttribute
	Integer version;
	@XmlAttribute
	String title;
	@XmlAttribute
	String date;
	@XmlAttribute
	String descr;

	public STB(String title, int version, String date, String descr) 
	{
		super();
		this.title = title;
		this.version = version;
		this.date = date;
		this.descr = descr;
	}

	public STB() {
		this.title = title;
		this.version = version;
		this.date = date;
		this.descr = descr;
	}

	@Override
	public String toString() 
	{
		return ("STB [Title=" + title + ",Version=" + version+ ",Date=" + date + ",Description=" + descr + "]");
	}
}