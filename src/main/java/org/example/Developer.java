package org.example;

public class Developer implements Employee{

    @Override
    public void display() {
        System.out.println("Inside Developer");
    }

    @Override
    public void displayOrg(){
        System.out.println("Practice developer org");
    }
}
