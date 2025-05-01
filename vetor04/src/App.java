import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[8];

        System.out.println("Digite 8 elementos");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();

             }

            System.out.println("Ordem inversa" );

            for (int i = vetor.length -1; i>=0;i--) {
                System.out.println(vetor[i]); 
                               
            }
           
            scanner.close();
        }
         
    }

