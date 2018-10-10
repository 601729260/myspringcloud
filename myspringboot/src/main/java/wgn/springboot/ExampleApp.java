package wgn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(value="wgn")
public class ExampleApp {
public static void main(String[] args) throws Exception {
SpringApplication.run(ExampleApp.class, args);
}
}
