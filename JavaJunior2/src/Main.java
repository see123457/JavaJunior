import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("1", 3, false));
        animals.add(new Cat("2", 5, true));


        for (Animal animal : animals) {
            System.out.println(String.format("Name: %s, Age: %d", animal.getName(), animal.getAge()));
            try {
                Method makeSoundMethod = animal.getClass().getMethod("makeSound");
                makeSoundMethod.invoke(animal);
            } catch (Exception e) {
                System.out.println("In class haven't method makeSound.");
            }
        }
    }
}