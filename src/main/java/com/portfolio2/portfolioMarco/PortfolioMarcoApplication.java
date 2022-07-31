package com.portfolio2.portfolioMarco;

import com.portfolio2.portfolioMarco.model.Estudio;
import com.portfolio2.portfolioMarco.model.Persona;
import com.portfolio2.portfolioMarco.repository.EstudioRepo;
import com.portfolio2.portfolioMarco.repository.PersonaRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PortfolioMarcoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(PortfolioMarcoApplication.class, args);
		PersonaRepo persorepo = context.getBean(PersonaRepo.class);

		Persona persona = new Persona(1L,"Marco","Iannuzzi","Programador","Villa Dolores","(03544)629803","marcoiannuzzi@live.com.ar","Quisiera poder formar parte de un grupo de trabajo donde tenga la posibilidad de desarrollar mis habilidades, logrando al mismo tiempo resultados y crecimiento","https://github.com/Marcoiannuzzi","https://media-exp1.licdn.com/dms/image/D4D35AQFtNONc7weYyA/profile-framedphoto-shrink_200_200/0/1640616077162?e=1659286800&v=beta&t=AFUdcdN0Sa3IpEHgA1x0IGRFhpEE-BosmwyIJVBj1Uw");
		persorepo.save(persona);
	}

}
