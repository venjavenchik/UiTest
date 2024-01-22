package utils;

import java.util.Random;

public class UserData {
    String emailField;

    public String emailField() {
        String emailPrefix = "venya";
        String email = emailPrefix + new Random().nextInt(1000) + "@gmail.com";
       return email ;
    }

    public String getEmailField() {
        return emailField;

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getAdressField() {
        return adressField;
    }
    String name = "Venya";
    String lastName ="Venchik";
    String phoneNumber = "123455666";
//    String email = emailField();
    String password ="1qaz2wsx3edc";
    String confirmPassword = "1qaz2wsx3edc";
    String adressField = "kakulasic123";

}
