package BlackJack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DemoApplication {

    private Object CardImageGenerator;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);}
    @GetMapping("/customRoute")
    @CrossOrigin("localhost:3000")
    public void drawCards(@RequestParam(value = "Card", defaultValue = "Return Cards")String Hand) {
        return ;
    }
}
