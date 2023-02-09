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

    

}
