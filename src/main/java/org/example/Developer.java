package org.example;

public class Developer implements Employee{
    private int id;
    private String name;
    public Developer(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    public Developer(){}
    public String getName() {
        return name;
    }
    @Override
    public int hashCode() {
        return id*10;
    }

    @Override
    public boolean equals(final Object obj) {
        if(obj==this)
        {
            return true;
        }
        if(obj==null || obj.getClass()!=this.getClass())
        {
            return false;
        }
        Developer developer= (Developer) obj;
        return developer.name.equals(this.name) && developer.id==this.id;
    }

    @Override
    public void display() {
        System.out.println("Inside Developer");
    }

    @Override
    public void displayOrg(){
        System.out.println("Practice developer org");
    }
}
