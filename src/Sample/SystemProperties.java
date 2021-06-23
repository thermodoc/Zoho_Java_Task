package Sample;

import java.util.Enumeration;
import java.util.Properties;

public class SystemProperties {
	public static void main(String args[])
	{
		Properties p = System.getProperties();
		Enumeration keys=p.keys();
		 while (keys.hasMoreElements()) {
            String key = (String)keys.nextElement();
            String value = (String)p.get(key);
            System.out.println(key + ": " + value);
		 }
		 System.out.println("The current working directory is " + System.getProperty("user.dir"));
        }

}
