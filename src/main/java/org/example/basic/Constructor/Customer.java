package org.example.basic.Constructor;

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private int age;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Custmomer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
