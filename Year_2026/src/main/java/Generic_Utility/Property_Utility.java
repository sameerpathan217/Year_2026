package Generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_Utility {

	
	public String readPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\Training\\TechM\\Year_2026\\src\\test\\resources\\Test_Data\\VTigerData.properties");
		Properties ps=new Properties();
		ps.load(fis);
	
		String data=ps.getProperty(key);	
		return data;
		
	}
}
