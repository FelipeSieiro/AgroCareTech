package br.com.fiap.plusoft.AgroCareTech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class AgroCareTechApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgroCareTechApplication.class, args);
	}
}
