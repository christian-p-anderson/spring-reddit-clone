package com.reddit.springredditclone.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
@AllArgsConstructor
public class MailContentBuilder {
    private final TemplateEngine templateEngine;

    String build(String message) {
        Context context = new Context();
        context.setVariable("message", message);
        return templateEngine.process("mailTemplate", context);
    }

//    String message = mailContentBuilder.build("Thank you for signing up to Spring Reddit, please click on the below url " +
//            "to activate your account : " + ACTIVATION_EMAIL + "/" + token);
}
