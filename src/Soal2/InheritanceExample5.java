package Soal2;

/**
 *
 * @author aizarrahima
 */
public class InheritanceExample5 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        
        System.out.println("animal.speak():");
        animal.speak();
        
        System.out.println("----------------------------");
        System.out.println("cat.speak():");
        cat.speak();
    }
}
