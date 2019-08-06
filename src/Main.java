import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This will calculate the first 10 amicable whole numbers from your starting number.");
        boolean isDone = false;
        while (!isDone) {
            System.out.println("Enter starting number(0 to exit):");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice==0) {
                isDone = true;
            } else {
                //Store numbers in array and compare to have no repeats
                for (int i=0; i<10; i++) {
                    int amicable = returnAmicable(choice);
                    if (amicable > 0) {
                        System.out.printf("%d - %d%n", choice, amicable);
                    } else {
                        i--;
                    }
                    choice++;

                }
            }
        }

    }

    public static int returnAmicable(int x) {
        int amicableTotal = 0;
        int amicablePotential = x;
        double divideCheck = x;
        for (int i=1; i<x; i++) {
            if ((amicablePotential/i) == (divideCheck/i)) amicableTotal = amicableTotal + i;
        }
        int amicableSecond = 0;
        amicablePotential = amicableTotal;
        divideCheck = amicableTotal;
        for (int i=1; i<amicableTotal; i++) {
            if ((amicablePotential/i) == (divideCheck/i)) amicableSecond = amicableSecond + i;
        }
        if (amicableSecond == x && amicableTotal != amicableSecond) {
            return amicableTotal;
        } else {
            return 0;
        }

    }
}
