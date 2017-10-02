package pl.lacrima.TheFirm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import pl.lacrima.TheFirm.service.WarehouseService;

@SpringBootApplication
@ServletComponentScan // <- This will enable spring boot to scan @WebServlet as well as @WebListener
public class TheFirmApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheFirmApplication.class, args);


	}
}
