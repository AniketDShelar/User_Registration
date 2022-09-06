package com.intellijide.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    //abc.xyz@bl.co.in
    // abc, bl and co mandatory
    // xyz and in are not mandatory
    static Pattern pattern = Pattern.compile("^(abc)[.]*[a-z]*[@](bl)[.](co)[.]*[a-z]*$");
    public static void main(String[] args) {
        Matcher matcher = pattern.matcher("abc.xyz@bl.co.in");
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false);
    }
}