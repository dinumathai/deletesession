package com.test.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteSessionController {

	@GetMapping("/delete-session")
	public String deleteUserSession(@RequestParam String user) {
		return "Deleted " + user;
	}
}
