package template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PreDestroy;

/**
 * Created by jifeng on 2017-07-04.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PreDestroy
    void beforeSutdown(){
        System.out.println("Custom cleanup before shutdown");
    }
}
