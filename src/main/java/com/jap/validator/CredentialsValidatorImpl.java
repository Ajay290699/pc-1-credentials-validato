package com.jap.validator;

public class CredentialsValidatorImpl {
    public String validateUser(String name1, String password2) {
        CredentialsValidator credentialsValidator = (userId, password1) -> {
            if (userId.equals("admin") && password1.equals("1234")) {
                return "valid user";
            } else {
                return "invalid user";
            }
        };
        return credentialsValidator.validator(name1, password2);
    }

}
