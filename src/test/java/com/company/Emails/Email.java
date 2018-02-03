package com.company.Emails;

import java.util.Objects;

public class Email {
    private String subject;
    private String whom;
    private String body;

    public String getSubject() {
        return subject;
    }

    public String getWhom() {
        return whom;
    }

    public String getBody() {
        return body;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setWhom(String whom) {
        this.whom = whom;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(subject, email.subject) &&
                Objects.equals(whom, email.whom) &&
                Objects.equals(body, email.body);
    }

    @Override
    public int hashCode() {

        return Objects.hash(subject, whom, body);
    }

    @Override
    public String toString() {
        return "Email{" +
                "subject='" + subject + '\'' +
                ", whom='" + whom + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public Email(String subject, String whom, String body) {
        this.subject = subject;
        this.whom = whom;
        this.body = body;
    }
}
