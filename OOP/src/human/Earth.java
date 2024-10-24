package human;

public class Earth {

    public static void main(String[] args) {
        // Human tom;
        // Human joe;
        Human human1 = new Human(32, "brown", "Jon", 76);
        Human human2 = new Human(30, "green", "Jane", 63);
        Human human3 = new Human(29, "blue", "Mary", 64);
        
        // tom = new Human();
        // joe = new Human();

        // tom.speak();

        // joe.age = 30;
        // joe.eyeColor = "blue";
        // joe.name = "joe";
        // joe.heightInInches = 68;
        // joe.speak();

        human1.speak();
        human2.speak();
        human3.speak();


    }

}
