package com.regex.java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPatternMatcher {
    Scanner sc = new Scanner(System.in);
    public void checkFirstName() {
        System.out.println("Enter first name start with Capital letter :");
        String firstName = sc.nextLine();
        if( Pattern.matches("^[A-Z]*[a-z]{2,}",firstName) ){
            System.out.println("first name is registered successfully");
        }
        else {
            System.out.println("first name pattern is not matched");
        }
    }
    public void checkLastName(){
        System.out.println("Enter last name start with Capital letter :");
        String lastname = sc.nextLine();
        if( Pattern.matches("^[A-Z]*[a-z]{2,}",lastname) ){
            System.out.println("last name is registered successfully");
        }
        else {
            System.out.println("last name pattern is not matched");
        }


    }
    public void checkEmail(){
        System.out.println("Enter Email Id :");
        String emailId = sc.nextLine();
        if(Pattern.matches("^[a-z]+([.$][a-zA-Z0-9]+[a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2})?",emailId))
        {
            System.out.println("Email is registered successfully");
        }
        else {
            System.out.println("Email is not matched");
        }

    }
    public void checkPassword() {
        System.out.println("Enter Password : ");
        String password = sc.nextLine();
        if(Pattern.matches("((?=.*\\d)(?=.*[A-Z])(?=.*\\W).{8,})",password)){
            System.out.println("password is registered successfully");
        }
        else {
            System.out.println("password is not matched");
        }
    }


    

}
