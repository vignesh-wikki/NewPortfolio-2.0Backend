package com.vignesh.RestController;

import com.vignesh.model.EmailDetails;
import com.vignesh.model.ProjectsModel;
import com.vignesh.service.EmailService;
import com.vignesh.service.ProjectService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@CrossOrigin(origins = {"https://wikki-portfolio.vercel.app", "http://localhost:5173", "http://localhost:3000"})
@RestController
@RequestMapping("/api")
public class ProjectController {
    @Autowired
    private ProjectService service;
    @Autowired
    private EmailService emailService;

    @GetMapping("/get/data")
    public ResponseEntity<ProjectsModel[]> getAllProjectsData() {
        log.info("Projects data requested");
        return ResponseEntity.ok(service.getAllData());
    }

    @PostMapping("/post/contact/data")
    public ResponseEntity<Map<String, String>> sendMail(@Valid @RequestBody EmailDetails body) {
        log.info("Contact form received from: {}", body.getName());
        try {
            String result = emailService.sendMail(body);
            return ResponseEntity.ok(Map.of("status", "success", "message", result));
        } catch (Exception e) {
            log.error("Failed to send email: {}", e.getMessage());
            return ResponseEntity.internalServerError()
                    .body(Map.of("status", "error", "message", "Failed to send email. Please try again later."));
        }
    }

    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> health() {
        return ResponseEntity.ok(Map.of("status", "UP", "service", "portfolio-backend"));
    }
}
