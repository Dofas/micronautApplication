package hello.world;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
public class HelloWorldController {

    @Get("/world")
    @Produces(MediaType.TEXT_PLAIN)
    public String printHelloWorld(){
        return "Hello world";
    }
}
