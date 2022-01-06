package com.artysh.singleton;

/**
 *  Суть синглтона в том что есть только один инстанс с которым мы работаем, т.е. не создаем новые объекты а работаем только с одним
 */
public class Singleton {
    private String value;
    private static Singleton instance;

    public static Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
