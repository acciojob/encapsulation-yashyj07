package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();


        /*
        rw.name = "Test";
        System.out.println(name);

        Getting below-mentioned error after Task-4:
            java: name has private access in com.driver.RWOnly
        */

        rw.setter("Test");
        rw.getter();

    }
}