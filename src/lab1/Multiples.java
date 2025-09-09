package lab1;

public class Multiples {
    public static int multiples(int limit, int a, int b) {
        int count = 0;
        for (int i = 1; i < limit; i++){
            if (i % a == 0 || i % b == 0){
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        // Example: How many numbers below 1000 are divisible by 3 or 5
        System.out.println(multiples(1000, 3, 5));}}
