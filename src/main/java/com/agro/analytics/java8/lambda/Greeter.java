package com.agro.analytics.java8.lambda;

public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter =  new Greeter();
        Greeting helloWorldGreeting = new HelloWorldGreeting();

        Greeting lambdaGreeting = () -> System.out.println("Hello world!");
        helloWorldGreeting.perform();

        Greeting innerClassGreeting =  new Greeting() {
            @Override
            public void perform() {
                System.out.println("Inner Hello world!");
            }
        };

    }
}