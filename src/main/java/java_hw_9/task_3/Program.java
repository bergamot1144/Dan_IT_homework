package java_hw_9.task_3;

public class Program {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal a1 = animalFactory.createAnimal("cat");
        Animal a2 =  animalFactory.createAnimal("dog");
        Animal a3 = animalFactory.createAnimal("bird");
        a1.speak();
        a2.speak();
        a3.speak();

    }

}
