package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Developer developer1=new Developer(6,"Sakshi");
        Developer developer2=new Developer(5,"Omkar");
        Developer developer3=new Developer(8,"Omkar");
        HashMap<Developer, String>mp=new HashMap<>();
        mp.put(developer1,"A grade");
        mp.put(developer2,"B grade");
        mp.put(developer3,"A grade");
        System.out.println("Grade of Sakshi" + mp.get(developer1));
        System.out.println("Grade of Omkar" + mp.get(developer2));
        System.out.println("Grade of Omkar2" + mp.get(developer3));

        printBucketIndex(developer1, developer2);
        printBucketIndex(developer2, developer3);

        printBucketIndex(developer2, developer1);
        Employee developer= new Developer();
        Employee it= new IT();
        developer.display();
        it.display();
        developer.displayOrg();
        it.displayOrg();
    }
    // Method to calculate and print bucket index
    public static void printBucketIndex(Developer developer, Developer otherDeveloper) {
        // Get the hash code of the developer
        int hashCode = developer.hashCode();

        // Get the capacity (default is 16, but you could adjust it)
        int capacity = 16; // HashMap initial capacity is typically 16
        System.out.println("Hashcode for  " + developer.getName() + ": " + hashCode);

        // Calculate bucket index using the formula
        int bucketIndex = (hashCode & (capacity - 1));

        System.out.println("Bucket index for " + developer.getName() + ": " + bucketIndex);
        // Check equality with developer2
        System.out.println("Is " + otherDeveloper.getName() + " equal to Omkar? " + developer.equals(otherDeveloper));
    }

}