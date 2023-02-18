public class Insertmetodo {
    public static void main(String[] args) {
        int qtd= 9999999;
        int [] vetor = new int [qtd];

        System.out.print("Vetor desordenado");
        for (int i =0; i<vetor.length;i++){
            vetor[i] = (int)(Math.random()*qtd);
            //System.out.print("\n");
            System.out.print(vetor[i]);
        }

        long tempoInicial=System.currentTimeMillis();
        insertionSort(vetor);
        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = "+(tempoFinal-tempoInicial)+" ms");

        System.out.print("Vetor Ordenado");
        for(int i=0;i<=vetor.length;i++){
           // System.out.print("\n");
            System.out.print(vetor[i]);
        }
    }
    public static void insertionSort(int[] vetor){
        int key;
        int i;
        for(int j=1;j<vetor.length;j++){
            key=vetor[j];
            for (i=j-1;(i>=0)&&(vetor[i]>key);i--){
                vetor[i+1]=vetor[i];
            }
        vetor[i+1]=key;
        }

    }
}