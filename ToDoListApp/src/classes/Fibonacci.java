package classes;


public class Fibonacci {
    public Fibonacci() {
        super();
    }
    /**
     * @param args
     * */
    public static void main(final String[] args) {
        final int maxSize = 10;
        for (int i = 0; i < maxSize; i++) {
            System.out.println(fibonacci(i));
        }
}
    /**
     * @param num holds the position
     * @return num || return fibonacci(num - 1) + fibonacci(num - 2)
     * */
    public static int fibonacci(final int num) {
        if (num <= 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

}
