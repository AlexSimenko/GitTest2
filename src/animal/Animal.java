package animal;

import InterF.Flying;

public class Animal implements Flying {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Animal(String name) {
        this.name = name;}
    public void makeSound() {
        System.out.println("The animal makes a sound");
}

    @Override
    public void Fly() {

    }
}
