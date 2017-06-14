package hello;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonRepository repository) {
		return (args) -> {
			repository.save(new Person("Amber", "Ercer"));
			repository.save(new Person("Bart", "Dandy"));
			repository.save(new Person("Candy", "Crew"));
			repository.save(new Person("Drew", "Blane"));
			repository.save(new Person("Eddy", "Arch"));
			System.out.println("Repository check:");
			for (Person per : repository.findAll()) {
				System.out.println(per);
			}
		};
	}
}
