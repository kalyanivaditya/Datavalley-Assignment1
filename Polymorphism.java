class Animal {
    public void makeSound() {
        System.out.println("generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Creating objects of derived classes
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        // Invoking the makeSound method
        dog.makeSound(); // This will call the makeSound method of Dog class
        cat.makeSound(); // This will call the makeSound method of Cat class
    }
}
