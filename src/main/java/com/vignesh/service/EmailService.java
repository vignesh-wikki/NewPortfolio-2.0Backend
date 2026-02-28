package com.vignesh.service;

import com.vignesh.model.EmailDetails;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String sender;

    public String sendMail(EmailDetails details) {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, false);
            helper.setFrom(sender);
            helper.setTo(sender); // Send to yourself (portfolio owner)
            helper.setReplyTo(details.getEmail()); // Reply goes to the visitor
            helper.setSubject("Portfolio Contact: " + details.getName());
            helper.setText(
                    "Name: " + details.getName() + "\n"
                            + "Email: " + details.getEmail() + "\n\n"
                            + "Message:\n" + details.getMessage()
            );

            javaMailSender.send(mimeMessage);
            log.info("Contact email sent successfully from: {}", details.getEmail());
            return "Message sent successfully!";
        } catch (MessagingException e) {
            log.error("Failed to send email: {}", e.getMessage());
            throw new RuntimeException("Failed to send email: " + e.getMessage());
        }
    }
}
