package pl.lacrima.TheFirm.email;

import org.springframework.context.annotation.Bean;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMsgUsingGmail {
@Bean
    public void sendingMailTo(String toMail, String login){

        final String from = "registercompanytf@gmail.com";
        final String username = "registercompanytf";
        final String password = "java1234";
        String to = toMail; //javawwa3@gmail.com


        String host = "smtp.gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");


        //logowanie - utworzenie sesji

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });


        try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));

            // Set Subject: header field
            message.setSubject("Dziekujemy za rejestracje" + login);

            // Now set the actual message
            message.setText("Witamy " + login + "rejestracja zakonczona pomyslnie. Mozesz teraz zalogowac się przy uzyciu wczesniej podanego loginu i hasla");

            // Send message
            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
