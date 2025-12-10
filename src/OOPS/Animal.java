package OOPS;

public class Animal {

    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters - Encapsulation
    public String getName() { return name; }
    public int getAge() { return age; }

    // Simple method
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
