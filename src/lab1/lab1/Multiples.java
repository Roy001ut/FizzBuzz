package lab1;

public class Multiples {
    public static int multiples(int range, int a, int b) {
        int count = 0;
        for (int i = 1; i < range; i++){
            if (i % a == 0 || i % b == 0){
                count++;
            }
        }
        return count;
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }
    public static void main(String[] args) {
        // Example: How many numbers below 1000 are divisible by 3 or 5
        System.out.println(multiples(1000, 3, 5));
    }
}
