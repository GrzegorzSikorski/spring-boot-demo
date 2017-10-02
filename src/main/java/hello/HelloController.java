package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:project.properties")
public class HelloController {

	private @Value("${application.version}") String projectVersion;

	@RequestMapping("/")
	public String index() {
		// return "Greetings from Spring Boot!\n Project version is: " +
		// loadProjectVersion();
		return "Greetings from Spring Boot!\n Project version is: " + projectVersion;

	}

}