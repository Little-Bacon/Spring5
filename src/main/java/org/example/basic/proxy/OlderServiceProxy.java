package org.example.basic.proxy;

import org.example.basic.common.OlderService;

public class OlderServiceProxy implements OlderService {
    @Override
    public void showOlder() {
        System.out.println("adds log");
    }
}
