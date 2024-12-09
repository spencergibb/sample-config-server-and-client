package demo.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigclientApplication {

	private final Environment env;

    public ConfigclientApplication(Environment env) {
        this.env = env;
    }

    @GetMapping("/")
	public String home() {
		return "foo.prop = " + env.getProperty("foo.prop");
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}

}
