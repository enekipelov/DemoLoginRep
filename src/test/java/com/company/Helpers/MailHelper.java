package com.company.Helpers;

import com.company.Emails.Email;
import com.company.Emails.EmailFactory;
import com.company.Pages.SendPage;

/**
 * Created by UITS-Admin on 21.01.2018.
 */
public class MailHelper extends SendPage{

    public void sendValidEmail(){
        Email validEmail = EmailFactory.getValidEmail();
        sendEmail(validEmail.getSubject(),validEmail.getWhom(),
                validEmail.getBody());
    }

}
