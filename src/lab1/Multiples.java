package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 1; number <= 1000; number++) {
            boolean three = number % 3 == 0;
            boolean five = number % 5 == 0;
            if (three) {count++;}
            if (five) {count++;}
            }

    System.out.println(count);}

    }
