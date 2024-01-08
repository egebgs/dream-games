package com.dream.caseStudy.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;


@RestController
public class controller {
	//Health end point
	@GetMapping("/health")
	public Map<String, String> healthCheck() {
	    Map<String, String> response = new HashMap<>();
	    response.put("status", "UP");
	    return response;
	}

	// Echo end point
	@GetMapping("/echo")
	public Map<String, String> echo(@RequestParam Map<String, String> allParams) {
	    return allParams;
	}
}
