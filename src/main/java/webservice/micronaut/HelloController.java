package webservice.micronaut;

import io.micronaut.http.annotation.*;

@Controller("/hello")
public class HelloController {

    @Get(uri="/{name}", produces="text/plain")
    public String index(String name) {
        return "Hi " + name;
    }
}