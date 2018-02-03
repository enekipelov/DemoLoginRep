package com.company.Emails;

import java.util.ResourceBundle;

public class EmailFactory {
    private static ResourceBundle bundle;

    static {
        bundle = ResourceBundle.getBundle("email");
    }

    public static Email getValidEmail()    {
        return new Email(bundle.getString("valid.subject"),
                bundle.getString("valid.whom"),
                bundle.getString("valid.body"));
    }
}
