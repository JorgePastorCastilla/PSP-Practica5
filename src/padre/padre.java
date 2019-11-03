package padre;

import hijo.FibonacciRunnable;
import hijo.FibonacciThread;

import java.util.Scanner;

public class padre {

    public static void main(String[] args) {

        int limite;
        Scanner sc = new Scanner( System.in );
        System.out.println("Hasta que numero quieres hacer las iteraciones de fibonacci?");
        limite = sc.nextInt();
        FibonacciThread fibonacciThread = new FibonacciThread();
        FibonacciRunnable fibonacciRunnable = new FibonacciRunnable();
        fibonacciThread.run();
        fibonacciRunnable.run();
        fibonacciThread.fibonacci( limite );
        fibonacciRunnable.fibonacci( limite );

    }

}
