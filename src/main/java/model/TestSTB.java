package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

public class TestSTB {
	public String loadFileXML() throws IOException {
		String ligne;
		StringBuilder message =new StringBuilder("");
		Resource resource;
		
		resource = new DefaultResourceLoader().getResource("classpath:smallSTB.xml");
		InputStream fis = resource.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		try {
			while((ligne =br.readLine()) != null)
			{
				message.append(ligne);
			}
			br.close();
			return message.toString();	
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
