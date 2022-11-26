package com.company.example2.utils;

import com.company.example2.utils.interfaces.IEmailService;

public class EmailServiceGmail implements IEmailService {

    public void sendEmail(String email){
        System.out.println(email+ ": Bonjour Gmail");
    }


}
