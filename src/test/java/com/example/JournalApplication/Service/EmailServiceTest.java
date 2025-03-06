package com.example.JournalApplication.Service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTest {

    @Autowired
    private EmailService emailService;

    @Disabled
    @Test
    void testSendEmail(){
        emailService.sendEmail("mandar.more1997@gmail.com", "Test Mail", "Test Body");
    }
}
