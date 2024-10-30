package gacpaiao.testSpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController
public class TestSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringSecurityApplication.class, args);
	}

	@RequestMapping(value = "/products")
	public String getProductName() {
		return "Honey";
	}

}
