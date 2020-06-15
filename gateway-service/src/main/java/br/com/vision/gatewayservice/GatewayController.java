package br.com.vision.gatewayservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

	@RequestMapping("/countriesfallback")
	public String countries() {
		return "Countries API is taking too long to responde or is down. Please try again later";
	}
	
	@RequestMapping("/jokefallback")
	public String joke() {
		return "Joke API is taking too long to responde or is down. Please try again later";
	}
	
}
