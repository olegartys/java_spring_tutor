package people;

import java.lang.Iterable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @RequestMapping("/people")
    public String person(Model model) {
        model.addAttribute("persons", repository.findAll());
        return "people";
    }

    @PostMapping("/people")
    public String postMethod(@RequestBody Person person) {
        repository.save(person);
        return "people";
    }

    @RequestMapping("/")
    public String home() {
        return "home";
    }

}
