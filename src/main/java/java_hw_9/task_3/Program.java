package java_hw_9.task_3;

public class Program {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal cat = animalFactory.createAnimal("cat");
        Animal dog = animalFactory.createAnimal("dog");
        Animal bird = animalFactory.createAnimal("bird");
        cat.speak();
        dog.speak();
        bird.speak();
    }
}
