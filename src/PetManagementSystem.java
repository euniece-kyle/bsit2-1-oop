
class PetService {
    private static final double BASE_FEE = 50.0;
    private static final double VACCINATION_FEE = 25.0;
    private static final double GROOMING_FEE = 30.0;

    public static double calculateFee() {
        return BASE_FEE;
    }

    public static double calculate(boolean withVaccination) {
        if (withVaccination) {
            return BASE_FEE + VACCINATION_FEE;
        } else {
            return BASE_FEE;
        }
    }

    public static double calculate(boolean withVaccination, boolean withGrooming) {
        double fee = BASE_FEE;
        if (withVaccination) {
            fee += VACCINATION_FEE;
        }
        if (withGrooming) {
            fee += GROOMING_FEE;
        }
        return fee;
    }

    public static double calculateFee(String emergencyType) {
        return 200.0; // Emergency fee fixed as 200
    }
}


abstract class Pet {
    protected String name;
    protected int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("Pet Name: " + name + ", Age: " + age);
    }
}

class Dog extends Pet implements Trainable {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }

    @Override
    public void performTrick() {
        System.out.println("Training " + name + ": Sits and shakes hands");
    }
}

class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
}

class Bird extends Pet implements Trainable {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet! Tweet!");
    }

    @Override
    public void performTrick() {
        System.out.println("Training " + name + ": Flies in circles and lands on perch");
    }
}


interface Trainable {
    void performTrick();
}


public class PetManagementSystem {
    public static void main(String[] args) {
       
        System.out.println("Basic checkup: $" + PetService.calculateFee());
        System.out.println("Checkup with vaccination: $" + PetService.calculate(true));
        System.out.println("Full service: $" + PetService.calculate(true, true));
        System.out.println("Emergency: $" + PetService.calculateFee("Emergency"));

        System.out.println();

           Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Whiskers", 2);
        Pet bird = new Bird("Tweety", 1);

        System.out.println("Welcome to the Pet Clinic!");
        System.out.println("==========================");
    //Dog
        dog.displayInfo();
        dog.makeSound();
        System.out.println();
   //Cat
        cat.displayInfo();
        cat.makeSound();
        System.out.println();
    //Bird
        bird.displayInfo();
        bird.makeSound();
        System.out.println();

        
        System.out.println("Training Session Started!");
        System.out.println("=========================");

        Trainable trainDog = (Trainable) dog;
        Trainable trainBird = (Trainable) bird;

        trainDog.performTrick();
        trainBird.performTrick();
    }
}
