package fr.univ.rouen.stbserver.model;
 
import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class STBList {
	
	
    @XmlElement
	private List<STB> stb;
 
 
	public void setSTB(List<STB> stbs) {
		this.stb = stbs;
	}
	
	public List<stbResume> resumerStb()
	{
		List<STB> liste= new ArrayList<STB>();
		liste=stb;
		List<stbResume> listeResume= new ArrayList<stbResume>();
		for(int i=0;i<liste.size();i++)
		{	
			STB stb=new STB();
			stb=liste.get(i);
			stbResume stbR=new stbResume(stb.id,stb.title,stb.version, stb.date,stb.descr);
			listeResume.add(stbR);
			
		}
		System.out.print(listeResume);
		return listeResume;
	}
}