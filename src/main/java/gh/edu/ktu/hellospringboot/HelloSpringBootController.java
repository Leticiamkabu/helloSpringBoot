package gh.edu.ktu.hellospringboot;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloSpringBootController {
    private final HelloSpringBootService helloSpringBootService;
    @Autowired
    public HelloSpringBootController(HelloSpringBootService helloSpringBootService) {
        this.helloSpringBootService = helloSpringBootService;
    }

    @RequestMapping("/greet")
    public String greet(){
        return helloSpringBootService.getGreetings();

    }

    @RequestMapping("/goodbye")
    public String goodbye(){
        return "{ Good bye }";

    }



}
