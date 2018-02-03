package com.company;

import com.company.Helpers.*;
import com.company.Pages.InboxPage;

/**
 * Created by UITS-Admin on 21.01.2018.
 */
public class App {
   public LoginHelper login = new LoginHelper();
    public HomeHelper home = new HomeHelper();
    public CommonHelper common = new CommonHelper();
    public MailHelper mail = new MailHelper();
    public AfterEmailSendHelper AES = new AfterEmailSendHelper();
    public InboxHelper inbox = new InboxHelper();
}
