package java_hw_9.task_3;

public class AnimalFactory {
    public Animal createAnimal(String type)
    {
        switch (type.toLowerCase())
        {
            case "dog": return new Dog();
            case "cat": return new Cat();
            case "bird": return new Bird();
            default: throw new IllegalArgumentException("Bad animal type.");
        }
    }

}
