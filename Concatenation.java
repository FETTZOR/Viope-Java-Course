public class Concatenation {
    public static void main(String[] args) {

        int first = 1;
        int second = 2;
        int third =  7;
        String fourth = "9";
        String fifth = "5";

        System.out.println(first + fourth + (second + third) + fifth
                + ":Finland was the world champion in ice hockey.");

        System.out.println(first + "" + (first + third) + (first - 1) + fourth
                + ": Finland went under Russian rule.");

        System.out.println(first + fifth + fifth + (first - 1)
                + ": Helsinki was founded.");
    }
}
//    Your task is to complete the program below by defining five variables
//        (first, second, third, fourth and fifth). Find out which variables ar
//        e int type and which are String type from the example print. You n
//        eed to find out the values used to initialize the variables in the example print.