package java_methods;

public class MyUtils {

    public static void printSomeJunk(String x){
        // "Void" in the above lines means there is no return
        System.out.println("At this point, you could only pass a string: " + x);
    }

    public static void printSomeJunk(int x){
        System.out.println("Now you can pass an int like: " + x);
        System.out.println("This is some polymorphism magic!");
    }

    public static int sum(int x, int y){
        // "Int" in the above lines says the return type is an int
        return(x+y);
    }

}
