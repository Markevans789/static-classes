package com.puralsight;

public class staticclasses {



    public static String format(String firstName, String lastName) {
        String prefix = null;
        return prefix + " " + firstName + lastName;
    }

    public static String
    format(String firstName, String middleName,  String lastName){
        return firstName + " " + middleName + " " + lastName;
    }

    public static String
    format(String prefix, String firstName, String middleName, String lastName) {

        return prefix + " " + firstName + " " + middleName + " " + lastName;
    }

    public static String formatWithMiddleInitial(String firstName,
                                                 String middleName,
                                                 String lastName) {
        return firstName + " " +
                middleName.charAt(0) + ". " +
                lastName;
    }

    public static String formatWithMiddleInitial(String prefix,
                                                 String firstName,
                                                 String middleName,
                                                 String lastName) {
        return prefix + " " +
                firstName + " " +
                middleName.charAt(0) + ". " +
                lastName;
    }
}

