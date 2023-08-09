package com.driver;

public class RWOnly {
    private String name;

    void setName(String name){
        this.name = name;
    }

    void getName(){
        System.out.println(this.name);
    }
}
