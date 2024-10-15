public class JavaArrays {

    public static void main(String [] args){
        // int values;

        // creates an error
        // values = 100, 200, 300;

        int [] values = new int[100];
        values[0] = 1000;
        values[99] = 93432;
        // creates an error
        // values[1] = "Hello"

        System.out.println(values[99]);

        String [] words = new String[] {"My", "Name", "Is"};

        System.out.println(words[2]);

    }


}
