package hijo;

public class FibonacciThread extends Thread {

    public void run(){
        System.out.println("Empieza Thread");
    }

    public void fibonacci(int limite){
        int v1 = 1;
        int v2 = 1;
        int resultado=0;
        System.out.println("Thread : " + v1 );
        System.out.println( "Thread : " + v2 );
        while( ( v1 + v2 ) <= limite ){
            resultado = v1+v2;
            System.out.println( "Thread : " + resultado );
            v1 = v2;
            v2 = resultado;
        }

    }

}
