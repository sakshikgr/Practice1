package org.example;

abstract class Developer implements Employee{
    abstract void info();

    @Override
    public void display() {
        System.out.println("Inside Developer display");
    }
}
