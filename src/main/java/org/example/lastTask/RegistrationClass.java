package org.example.lastTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationClass {

    //This code is written by Hashmat Sayar

    private String email;
    private String userName;
    private String userPwd;

    RegistrationClass() {
        email = "";
        userName = "";
        userPwd = "";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String email1 = email.trim();
        if (!email1.isBlank()) {
            Pattern yahooPattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@yahoo\\.(com|[a-z]{2})$");
            Matcher test = yahooPattern.matcher(email1);
            if (test.find()) {
                this.email = email1;
                return;
            }
        }
        System.out.println("Please, enter correct Yahoo email. Email was not set.");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        String user = userName.trim();
        if (!(user.isBlank() || user.matches(".*\\s.*"))) {     // is blank or contains blank chars ??
            Pattern userNamePattern = Pattern.compile("^[a-zA-Z0-9._-]{6,30}$");   // len must be between 6 and 30 chars
            Matcher test = userNamePattern.matcher(user);
            if (test.find()) {
                this.userName = user;
                return;
            }
        }
        System.out.println("Please, enter correct user name (6-30 chars, a-zA-Z0-9._-).");
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        if (userName.isEmpty()) {
            System.out.println("The username is blank. Please set the username first.");
            return;
        }
        String pwd = userPwd.trim();
        if (pwd.contains(userName)) {
            System.out.println("The password must not contain the username! Password was not set.");
            return;
        }
        if (!(pwd.isBlank() || pwd.matches(".*\\s.*"))) {     // is blank or contains blank chars ??
            Pattern userNamePattern = Pattern.compile("^[a-zA-Z0-9._#@-]{6,30}$");   // len must be between 6 and 30 chars
            Matcher test = userNamePattern.matcher(pwd);
            if (test.find()) {
                this.userPwd = pwd;
                return;
            }
        }
        System.out.println("Please, enter correct user name (6-30 chars, a-zA-Z0-9._#@-).");

    }

    public static void main(String[] args) {
        RegistrationClass userReg = new RegistrationClass();

        userReg.setEmail("    %adam%@yahoo.com  ");
        userReg.setUserName("   kj_ds.cd-s   ");
        userReg.setUserPwd("   ac@ds145##         ");

        System.out.println("User: '" + userReg.getUserName() + "'");
        System.out.println("Email: '" + userReg.getEmail() + "'");
        System.out.println("Pass: '" + userReg.getUserPwd() + "'");
    }
}
