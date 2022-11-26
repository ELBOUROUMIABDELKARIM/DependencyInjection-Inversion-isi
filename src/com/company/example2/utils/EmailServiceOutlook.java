package com.company.example2.utils;

import com.company.example2.utils.interfaces.IEmailService;

public class EmailServiceOutlook implements IEmailService {
    @Override
    public void sendEmail(String email) {
        System.out.println(email+": Bonjour Outlook!");
    }
}
