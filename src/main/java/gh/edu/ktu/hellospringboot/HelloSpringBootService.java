package gh.edu.ktu.hellospringboot;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class HelloSpringBootService {
    public String getGreetings(){
        Integer hour = LocalDateTime.now().getHour();

        if (hour < 12) {
            return "{ Good morning }";
        }
        else if (hour < 16) {
            return "{ Good afternoon }";
        }
        else {
            return "{ Good evening }";
        }
    }
}
