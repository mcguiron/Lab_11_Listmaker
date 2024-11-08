//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class SafeInput {
    public SafeInput() {
    }

    public static String getNonZeroLensString(Scanner pipe, String prompt) {
        String retVal = "";

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.isEmpty()) {
                System.out.println("You must enter at least character...");
            }
        } while(retVal.isEmpty());

        return retVal;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not " + trash);
            }
        } while(!done);

        return retVal;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0.0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double, not " + trash);
            }
        } while(!done);

        return retVal;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]: ");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not " + trash);
            }
        } while(!done);

        return retVal;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String YNResponse = "";
        Boolean retVal = false;
        Boolean done = false;

        do {
            System.out.print(prompt + ": ");
            YNResponse = pipe.nextLine();
            if (!YNResponse.matches("[YyNn]")) {
                System.out.println("You must enter [Y/N]: ");
            } else {
                done = true;
                switch (YNResponse) {
                    case "Y":
                    case "y":
                        retVal = true;
                        break;
                    case "N":
                    case "n":
                        retVal = false;
                }
            }
        } while(!done);

        return retVal;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = 0.0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("You must enter a double within the range [" + low + " - " + high + "]: ");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not " + trash);
            }
        } while(!done);

        return retVal;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retVal = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.matches(regEx)) {
                done = true;
            } else {
                System.out.println("You must enter a matching expression buddy, not " + retVal);
            }
        } while(!done);

        return retVal;
    }
}
