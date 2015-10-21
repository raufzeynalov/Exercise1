import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you now? :)");
		System.out.print("Please enter your name:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String username=null;
		try {
			username = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HelloUser helloUser =  new HelloUser(username);
		helloUser.greetUser();
		
	}

}
