public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(10));
    }
    public static int reduce(int a) {
        int steps = 0;
        while (a != 0) {
            if (a % 2 == 0) {
                a = a / 2;
            } else {
                a = a - 1;
            }
            steps++;
        }
        return steps;
    }
}
