package com.bl;

import java.util.regex.Pattern;

public class UserRegistrationUC2 {

    public static boolean isValidFirstName(String name) {

        return isValidInput(Constants.NAME_REGEX,name);
    }

    public static boolean isValidLastName(String name) {

        return isValidInput(Constants.NAME_REGEX,name);
    }

    private static boolean isValidInput(String regex, String input) {

        return Pattern.matches(regex,input);

    }
}
