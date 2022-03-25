package com.bytelegend;
public class Cat {
    public static void dog(int a){
        System.out.println("There have "+a+" dogs");

    }
    public static void  cats(int b){
        System.out.println("There have "+b+" cats");

    }
    public static void fight(int x,int y){
        if(x>y){
            System.out.println("dogs win the game!!");
        }else
        System.out.println("cats win the game!!");
    }
    public static void main(String[] args){
        int x,y;
        x=2;
        y=3;
        dog(x);
        cats(y);
        fight(x,y);
    }
}