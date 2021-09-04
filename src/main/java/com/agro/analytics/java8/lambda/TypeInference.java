package com.agro.analytics.java8.lambda;

public class TypeInference {
    public static void main(String[] args) {
        StringLengthLambda myLamdba = String::length;
        System.out.println(myLamdba.getLength("Hello Lambda"));
    }


    interface StringLengthLambda{
        int getLength(String s);
    }
}
