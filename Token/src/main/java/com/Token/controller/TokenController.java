package com.Token.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Token.model.JwtUser;
import com.Token.security.JwtGenerator;

@RestController
@RequestMapping("/token")
public class TokenController {

	    private JwtGenerator jwtGenerator;
 
	    public TokenController(JwtGenerator jwtGenerator) {
	        this.jwtGenerator = jwtGenerator;
	    }

	    @PostMapping
	    public String generate(@RequestBody final JwtUser jwtUser) {

	        return jwtGenerator.generate(jwtUser);

	    }
}
