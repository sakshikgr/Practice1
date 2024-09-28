package org.example;

public interface Employee {
    void display();
    default void displayOrg(){
        System.out.println("Practice org");
    }
}
