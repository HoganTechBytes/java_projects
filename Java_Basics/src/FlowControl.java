public class FlowControl {
    public static void main(String[] args) {
        
        boolean hungry = true;

        if(hungry){
            System.out.println("I'm starving!");
        }else{
            System.out.println("I'm not hungry.");
        }

        int x = 0;
        System.out.println("Variable \"x\" is equal to " + x);

        for(int i = 0; i < 101; ++i){
            x += i;
        }

        System.out.println("Now variable \"x\" is equal to " + x);

        int month = 6;
        String monthString;

        switch(month){
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            default:
                monthString = "I didn't go past June";

        }

        System.out.println(monthString);
    }
}
