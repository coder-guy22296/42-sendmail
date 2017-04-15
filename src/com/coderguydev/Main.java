package com.coderguydev;

import org.apache.commons.mail.*;

public class Main {

    public static void main(String[] args) {
        Email myEmail;

        System.out.println("SENDING...");
        myEmail = new SimpleEmail();
        myEmail.setHostName("smtp.42.us.org");
        myEmail.setSmtpPort(25);
        myEmail.setSSLOnConnect(false);
        try {
            myEmail.setFrom("cyildiri@student.42.us.org");
            myEmail.setSubject("sent with smtp.42.us.org:25 no ssl");
            myEmail.setMsg("Final email server test");
            myEmail.addTo("canpy30@gmail.com");
            myEmail.send();
        } catch (EmailException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("SENT!");
    }
}
