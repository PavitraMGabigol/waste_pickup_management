
package com.example.wastepickup.observer;

public class AdminObserver implements Observer {
    private String name;

    public AdminObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Admin " + name + " received update: " + message);
    }
}
