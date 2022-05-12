package com.acarullo.hashmap;

/**import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
*/
import java.util.HashMap;

//@SpringBootApplication
public class HashmapApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(HashmapApplication.class, args);
		HashMap<String, String> telefono = new HashMap<String, String>();

		telefono.put("Andrea", "3288425865");
		telefono.put("Pippo", "3479999999");
		telefono.put("Pluto", "3339998880");

		System.out.println(telefono.get("Andrea"));
	}

}
