
package com.example.event_service;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EventController {

    @GetMapping("/events")
    public String events() {
        return """
            Available Events:
            1. Python Workshop
            2. Java Workshop
            3. AI Seminar
            4. Cloud Computing
            5. Web Development
            6. Cyber Security
            7. Data Science
            8. Android Development
            """;
    }

    @PostMapping("/register")
    public String register(@RequestBody Student s) {

        return "Registration Successful!\n"
             + "Name: " + s.name + "\n"
             + "Email: " + s.email + "\n"
             + "Mobile Number: " + s.mobilenum + "\n"
             + "College Name: " + s.colname;
    }
}