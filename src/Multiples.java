public class Multiples {

    public static void main(String args) {
        System.out.println(countMultiples(1000));
    }
    public static int countMultiples(int number) {
        int multiples = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples++;
            }
        }
        return multiples;
    }
}
