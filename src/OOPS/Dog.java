package OOPS;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);   // calling parent constructor
        this.breed = breed;
    }

    @Override
    public void makeSound() {   // Polymorphism
        System.out.println("Dog barks");
    }

    public String getBreed() {
        return breed;
    }
}
