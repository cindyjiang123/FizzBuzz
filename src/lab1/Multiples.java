package lab1;

public class Multiples {
    public static void main(String[] args) {

        System.out.println(multiples(1000,3,5));}

    public static int multiples(int a,int b,int c) {
        int count = 0;
        for (int number = 1; number < a; number++) {
            boolean three = number % b == 0;
            boolean five = number % c == 0;
            if (three && five)  {count++;}
            else if (three) {count++;}
            else if (five) {count++;}
            else {}
            }
        return count;
    }
    public static int multiples() {
        return Multiples.multiples(1000,3,5);
    }

}
