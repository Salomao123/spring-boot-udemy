package br.com.erudio.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.models.Greetings;

@RestController
public class GreetingsController {

	
	private static final String TEMPLATE = "Hello, %s!";
	
	private static final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greetings greetings(@RequestParam(value="name", defaultValue="word") String name) {
		return new Greetings(counter.incrementAndGet(), String.format(TEMPLATE, name));
		
	}
}
