package org.example;

public class MyApp {
    public static void sayHi() {
        System.out.println("Hello World!");
    }

    public static void sayBye() throws IllegalArgumentException {
            throw new IllegalArgumentException();
    }
    public static void main( String[] args ) throws Exception {
        sayHi();
        sayBye();
    }
}
