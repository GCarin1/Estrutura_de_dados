public class Fibonacci {
    public static void main(String[] args) throws Exception {
        new Fibonacci();
    }

    public Fibonacci() {
        System.out.println("Fibo da posição 5: "   + fibo(5));
        System.out.println("Fibo da posição 10: " + fibo(10));
        System.out.println("Fibo da posição 30: " + fibo(30));
        System.out.println("Fibo da posição 40: " + fibo(40));  //demora aproximadamente uns 2 segundos
        System.out.println("Fibo da posição 47: " + fibo(47));
        System.out.println("Fibo da posição 47: " + fibo(60)); // demora aprox. uns 26 segundos (depende do hardware)
        //System.out.println("Fibo da posi��o 50: " + fibo(50)); //este c�lculo demora talvez 2 minutos ou mais
    }

    public long fibo(int n) {
        //fun��o fibo em forma recursiva
        if (n < 0) return -1;  // opcional: n�o definido para valores negativos
        else if (n == 0) return 0;  //1� n�mero da seq. de Fibonacci � zero
        else if (n == 1) return 1;  //2� n�mero da seq. de Fibonacci � 1
        else return (fibo(n - 1) + fibo(n - 2)); //observe que temos duas chamadas recursivas a fibo
    }
    
}
