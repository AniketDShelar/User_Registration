package com.intellijide.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,} [A-Z][a-z]{2,}$");
    public static void main(String[] args) {
        Matcher matcher = pattern.matcher("Aniket Shelar");
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false);
    }
}