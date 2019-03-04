import java.lang.Math;
import java.util.Scanner;
public class UdacityTesting {
    public static void main(String args[]) {
        int bankBalance = 500;
        bankBalance += 250;
        bankBalance -= 100;
        System.out.println(bankBalance);

        String firstName = "Mahbod";
        String lastName = "Sabbaghi";
        String fullName = firstName + " " + lastName;
        int numChar = fullName.length() - 1;
        System.out.println("Hello, my name is " + fullName + ". And I have " + numChar + " characters in my name!");

        double fahrenheit = (Math.random() * 100);
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);

        boolean canSeePlayer = false;
        boolean playPoweredUp = true;
        if (canSeePlayer) {
            if (!playPoweredUp) {
                System.out.println("Attack");
            } else {
                System.out.println("Run away!");
            }
        } else {
            System.out.println("Wander.");
        }

        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;
        if (isRaining || isSnowing || temperature < 50) {
            System.out.println("Lets stay home");
        } else {
            System.out.println("Lets go out!");
        }

        int time = (int) (Math.random() * 100 - 76);
        String timeOfDay;
        if (time >= 5 && time < 12) {
            timeOfDay = "Morning";
        } else if (time >= 12 && time < 20) {
            timeOfDay = "Daytime";
        } else {
            timeOfDay = "Night";
        }
        System.out.println(timeOfDay);

        boolean holiday = false;
        int weekday = (int) (Math.random() * 10 - 3);
        if (weekday == 0) {
            weekday += 1;
            System.out.println("Its a monday! WAKE UP AT 7");
        } else if (weekday >= 1 && weekday <= 5) {
            System.out.println("WaKE UP");
        } else {
            System.out.println("Bad");
        }


        int dayOfWeek = (int) Math.ceil(Math.random() * 10 - 3);
        String schedule;
        switch (dayOfWeek) {
            case 1:
                schedule = "Gym in the morning.";
                break;
            case 2:
                schedule = "Class after work.";
                break;
            case 3:
                schedule = "Meetings all day.";
                break;
            case 4:
                schedule = "Work from home.";
                break;
            case 5:
                schedule = "Game night after work.";
                break;
            case 6:
            case 7:
                schedule = "Free";
                break;
            default:
                System.out.println("Program broke lol");
                break;
        }
    }
}