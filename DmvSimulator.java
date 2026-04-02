import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        Random rand = new Random();
        int userNumber = rand.nextInt(200) + 1;
        int waitMillis = 200; // wait time between calls in milliseconds

        System.out.println("Welcome to the DMV!");
        System.out.println("Your number is: " + userNumber);
        System.out.println("Please wait for your number to be called...");

        int current = userNumber + 1;

        while (current != userNumber) {
            if (current > 200) current = 1;
            System.out.println("Now serving number: " + current);
            try {
                Thread.sleep(waitMillis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
            current++;
        }

        System.out.println("Now serving number: " + userNumber);
        System.out.println("You don’t have the required paperwork and you smell bad and you're not funny. muhahahaha");
    }
}