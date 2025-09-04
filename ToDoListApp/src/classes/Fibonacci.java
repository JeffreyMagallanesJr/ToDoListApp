package classes;


public class Fibonacci {
    /**
     * @param args
     * */
    private int maxSize;
    
    public Fibonacci (int size) {
        this.maxSize = size;
    }
    
    public void displayResult () {
        for (int i = 0; i < this.maxSize; i++) {
            System.out.println(fibonacciProcess(i));
        }
}
    /**
     * @param position holds the position
     * @return position || return fibonacci(position - 1) + fibonacci(position - 2)
     * */
    public static int fibonacciProcess(final int position) {
        if (position <= 1) {
            return position;
        } else {
            return fibonacciProcess(position - 1) + fibonacciProcess(position - 2);
        }
    }
}
