package com.artysh.singleton;

public class Main {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.setValue("This is value");
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getValue());
    }
}
