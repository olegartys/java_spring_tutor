package springTest;


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
			repository.save(new Person("John", "Doe"));
			repository.save(new Person("Rachel", "Amber"));
			repository.save(new Person("Max", "Coldfield"));
			repository.save(new Person("Chloe", "Price"));
		};
	}
}
