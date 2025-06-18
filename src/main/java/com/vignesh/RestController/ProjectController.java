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

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@Slf4j
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class ProjectController {
    @Autowired
    private ProjectService service;
    @Autowired
    private EmailService emailService;

    @GetMapping("/get/data")
    public ResponseEntity<ProjectsModel[]> getAllProjectsData() {
        return ResponseEntity.status(200).body(service.getAllData());
    }

    @PostMapping("/post/contact/data")
    public ResponseEntity<String> sendMail(@Valid @RequestBody EmailDetails body) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(() -> emailService.sendMailWithAttachment(body));
        new Thread(futureTask).start();
        return ResponseEntity.accepted().body(futureTask.get());
    }
}
