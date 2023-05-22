package org.example.basic;

public class OlderServiceProxy implements OlderService{
    @Override
    public void showOlder() {
        System.out.println("adds log");
    }
}
