/**
 * 
 */
package com.example.oauth2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nuwan
 *
 */

@RestController
public class HomeRestController {
	
	@GetMapping
    @PreAuthorize("hasRole('ROLE_USER')")
    public ResponseEntity<?> get() {
        return ResponseEntity.ok("it's Working");
    }

}
