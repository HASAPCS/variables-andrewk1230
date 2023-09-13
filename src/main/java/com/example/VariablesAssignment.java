package com.example;

public class VariablesAssignment {

    // TODO: Declare and initialize a byte variable with any value between 1 and 127
    byte byteVariable = 2;

    // TODO: Declare and initialize a short variable with any value between 1 and 32767
    short shortVariable = 234;

    // TODO: Declare and initialize an int variable with any positive value
    int intVariable = 234;

    // TODO: Declare and initialize a long variable with any positive value
    long longVariable = 123;

    // TODO: Declare and initialize a float variable with any positive value
    float floatVariable = 12.5f;

    // TODO: Declare and initialize a double variable with any positive value
    double doubleVariable = 123.23;

    // TODO: Declare and initialize a char variable with the initial of your first name
    char charVariable = 's';

    // TODO: Declare and initialize a boolean variable with the value true or false
    boolean booleanVariable = true;

    // TODO: Create a method that accepts two integers as parameters and returns their sum
    public int sum(int a, int b) {
        // Your code here
        
        return a+b; // Change this line to return the actual sum
    }

    // TODO: Create a method that accepts two double parameters and returns their product
    public double product(double a, double b) {
        // Your code her
        return a*b; // Change this line to return the actual product
    }

    // TODO: Create a method that accepts a string parameter and returns it in reverse
    public String reverseString(String str) {
        // Your code here
        String word = "";
        for(int i = str.length()-1; i>=0;i--){
            word += str.charAt(i);
        }
        return word; // Change this line to return the reversed string
    }
}
