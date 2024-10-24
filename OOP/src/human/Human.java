package human;

public class Human {

    String name;
    int age;
    int heightInInches;
    String eyeColor;

    // Default Constructor
    public Human(){
        
    }

    public Human(int age, String eyeColor, String name, int heightInInches){
        super();
        this.age = age;
        this.eyeColor = eyeColor;
        this.name = name;
        this.heightInInches = heightInInches;

    }

    // Constructor

    public void speak(){
        System.out.printf("Hello my name is %s.%n", name);
        System.out.printf("I am %d inches tall.%n", heightInInches);
        System.out.printf("I am %d years old.%n", age);
        System.out.printf("My eyes are %s in color.%n", eyeColor);
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void walk(){
        System.out.println("Walking...");
    }

    public void work(){
        System.out.println("Working...");
    }

}
