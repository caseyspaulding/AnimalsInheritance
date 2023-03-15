import com.skillstrom.general.Animals;
import com.skillstrom.general.Cat;
import com.skillstrom.general.Dog;
import com.skillstrom.general.Lion;

public class Main {
    public static void main(String[] args) {
        System.out.println("***** Welcome to the 3 Animal Zoo *****");
        System.out.println();
        System.out.println( "********ANIMALS********");

        Animals animal = new Animals();
        animal.speak();
        animal.eat();
        animal.sleep();
        System.out.println();

        Lion lion = new Lion("Simba", "Mammal", "Orange", "Roar");
        lion.speak();
        lion.eat();
        lion.sleep();
        lion.running();
        lion.hunt();
        System.out.println();

        Dog dog = new Dog("Rocky", "Mammal", "Brown", "Bark");
        dog.speak();
        dog.eat();
        dog.sleep();
        dog.fetch();
        System.out.println();

        Cat cat = new Cat("Mittens", "Mammal", "White", "Meow");
        cat.speak();
        cat.eat();
        cat.sleep();
        cat.scratch();
        System.out.println();

    }
}