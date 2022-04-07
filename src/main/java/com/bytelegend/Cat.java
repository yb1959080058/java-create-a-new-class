package com.bytelegend;

public class Cat {
    private String name;
    private int age;

    Cat(){
    }

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return this.age;
    }
}