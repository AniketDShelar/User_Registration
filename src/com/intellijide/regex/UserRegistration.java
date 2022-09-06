package com.intellijide.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner scan = new Scanner(System.in);
    public void firstName() {
        System.out.println("Enter first Name : ");
        String firstName = scan.next();
        Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher1 = pattern1.matcher(firstName);
        if (matcher1.matches()){
            System.out.println(true);
    }else{
            System.out.println(false);
            System.out.println("Enter Name in valid format, first letter should be capital case and remaining in small case");
    }
}
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.firstName();
    }
}