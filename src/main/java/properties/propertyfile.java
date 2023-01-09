package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.app.pages.added;


public class propertyfile {

	static Properties prop =new Properties();
    public static void main(String[] args) throws IOException {
        getpropertyfile();

 

    }

 

    public static void getpropertyfile() throws IOException {
        InputStream input =new FileInputStream("C:\\Users\\Public\\repo\\Assigement2023\\src\\main\\java\\properties\\config.properties");
        prop.load(input);
        String loginnumber =prop.getProperty("login");
        String passw =prop.getProperty("password");
        String url5=prop.getProperty("url");
        
        added.login=loginnumber;
        added.password=passw;
        added.url=url5;
        


    }
}
