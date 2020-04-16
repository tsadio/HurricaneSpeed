import java.util.Scanner;

public class HurricaneSpeed {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int speed;

        System.out.print("Enter the Hurricane Speed in mph: ");
        speed = in.nextInt();

        if (speed >= 157)
            System.out.println("Speed: " + speed + "    Category 5.");
        else if (speed >= 130)
            System.out.println("Speed: " + speed + "    Category 4.");
        else if (speed >= 111)
            System.out.println("Speed: " + speed + "    Category 3.");
        else if (speed >= 96)
            System.out.println("Speed: " + speed + "    Category 2.");
        else if (speed >= 74)
            System.out.println("Speed: " + speed + "    Category 1.");
        else
            System.out.println("Speed: " + speed + "    Too weak to be " +
                    "an Hurricane.");

    }
}