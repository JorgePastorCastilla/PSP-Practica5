package hijo;

public class FibonacciRunnable implements Runnable{

    public void run(){
        System.out.println("Empieza Runnable");
    }

    public void fibonacci(int limite){
        int v1 = 1;
        int v2 = 1;
        int resultado=0;
        System.out.println( "Runnable : " + v1 );
        System.out.println( "Runnable : " + v2 );
        while( ( v1 + v2 ) <= limite ){
            resultado = v1+v2;
            System.out.println( "Runnable : " + resultado );
            v1 = v2;
            v2 = resultado;
        }

    }
}
