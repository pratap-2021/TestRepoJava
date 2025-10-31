package geekForGeeks;

public class inheritence {


}
// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
    void speedUp(){
        System.out.println("speed of lion is 80km/h");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
    void catColor(){
        System.out.println("color is brown");
    }
}

class lion extends Cat{
    void catFood(){
        System.out.println("cat food is mice");
    }
}

// New class to demonstrate
class Zoo {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism: Dog object treated as Animal
        Animal myCat = new Cat(); // Polymorphism: Cat object treated as Animal

        myDog.makeSound(); // Calls Dog's makeSound()
        myCat.makeSound(); // Calls Cat's makeSound()
        lion li = new lion();
        li.speedUp();

    }
}
