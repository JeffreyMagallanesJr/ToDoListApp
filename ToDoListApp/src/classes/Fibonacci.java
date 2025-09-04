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
            if (i == (this.maxSize - 1)) {
                System.out.print(fibonacciProcess(i));
            } else {
                System.out.print(fibonacciProcess(i) + ", ");
            }
            
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
