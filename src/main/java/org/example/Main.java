package org.example;

public class Main {
    public static void main(String[] args) {
        Employee developer= new Developer();
        Employee it= new IT();
        developer.display();
        it.display();
        developer.displayOrg();
        it.displayOrg();
    }
}