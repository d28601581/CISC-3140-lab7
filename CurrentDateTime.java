import java.text.SimpleDateFormat;  
import java.util.Date;  
public class CurrentDateTime {  
	public static void main(String[] args) {  
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		Date date = new Date();  
		System.out.println("Hello, World");
		System.out.println("Current date and time is:");
		System.out.println(formatter.format(date));  
		
	}  
}
