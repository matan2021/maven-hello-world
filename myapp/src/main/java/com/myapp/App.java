// package com.myapp;

// /**
//  * Hello world!
//  *
//  */
// public class App 
// {
//     public static void main( String[] args )
//     {
//         System.out.println( "Hello World from Matan!" );
//     }
// }
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World from Matan!");
        try {
            Thread.sleep(Long.MAX_VALUE); // Keep the application running
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
