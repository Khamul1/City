package ru.javabegin.objects;

public class Settler {

    public Settler() {
    }

    private String name; // житель

    public Settler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
