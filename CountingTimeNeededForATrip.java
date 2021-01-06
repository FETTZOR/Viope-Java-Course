import java.util.Scanner;

public class CountingTimeNeededForATrip {
    public static void main(String args[]) {
        double speed, distance, time;

        distance = askDistance();
        speed = askSpeed();
        time = countTime(distance, speed);

        System.out.println("Time needed to complete the trip is " + time + " hours.");
    }
    private static double askDistance() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in the length of the trip (km): ");
        double askDistance = reader.nextDouble();
        return askDistance;
    }

    private static double askSpeed() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your average speed (km/h): ");
        double askSpeed = reader.nextDouble();
        return askSpeed;
    }

    private static double countTime(double distance,double speed) {
        double countTime = distance / speed;
        return countTime;
    }
}
//The class Travel below asks for the distance of the trip and
//        average speed the trip is driven at. Then the program
//        prints the time needed to finish the trip in hours.
//        Your task is to write the methods askDistance,
//        askSpeed and countTime missing from the class declaration.