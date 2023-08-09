package com.driver;

public class RWOnly {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void getName(){
        System.out.println(this.name);
    }
}
