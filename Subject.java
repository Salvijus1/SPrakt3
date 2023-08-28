package org.example;

public class Subject {
    private String name;
    private int credits;

    public Subject() {
    }

    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    // getters
    public String getName() { return name; }
    public int getCredits() { return credits; }

    // setters
    public void setName(String name) { this.name = name; }
    public void setCredits(int credits) { this.credits = credits; }
}
