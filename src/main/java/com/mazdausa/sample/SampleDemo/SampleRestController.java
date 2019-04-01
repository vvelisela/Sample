package com.mazdausa.sample.SampleDemo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SampleRestController {

	    @RequestMapping("/hello/rparam")
	    public String index() {
	        return "Greetings from Spring Boot!";
	    }
}
