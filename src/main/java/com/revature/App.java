package com.revature;

import java.util.Arrays;

public final class App {
    private App() {
    }

    /**
     * Java: 1) Write a function that returns true if a string consists of ascending
     * or ascending AND consecutive numbers.
     * 
     * @param args
     */
    public static boolean ascending(String toCheck) {
        int current = -1;
        int currentLength = 1;
        while (currentLength <= (toCheck.length() / 2)) {
            for (int i = 0; i < toCheck.length(); i += currentLength) {
                int nextCheck;
                try {
                    nextCheck = Integer.parseInt(toCheck.substring(i, (i + currentLength)));
                } catch (Exception e) {
                    break;
                }
                if (current == -1) {
                    current = nextCheck;
                } else {
                    if (nextCheck == (current + 1)) {
                        if (i >= toCheck.length() - currentLength) {
                            return true;
                        }
                        current = nextCheck;
                    } else {
                        break;
                    }
                }
            }
            current = -1;
            currentLength++;
        }
        return false;
    }

    public static void squarePatch(int n) {
        if (n == 0) {
            System.out.println("[]");
        } else {
            Integer[][] theArray = new Integer[n][n];
            StringBuilder sb = new StringBuilder();
            for (Integer[] row : theArray)
                Arrays.setAll(row, i -> n);
            sb.append("[\n");
            for (Integer[] row : theArray) {
                sb.append("[");
                for (Integer column : row) {
                    sb.append("" + column + ", ");
                }
                sb.delete(sb.length() - 2, sb.length());
                sb.append("],\n");
            }
            sb.delete(sb.length() - 2, sb.length());
            sb.append("\n]\n");
            System.out.println(sb.toString());
        }
    }

    /**
     * Java Clash of Code...
     */
    public static int queensAttack() {
        return 0;
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println(ascending("232425"));
        System.out.println(ascending("2324256"));
        System.out.println(ascending("56789"));
        System.out.println(ascending("444445"));
        squarePatch(5);
        squarePatch(1);
        squarePatch(0);
        queensAttack();
        System.out.println("Hello World!");
    }
}
