import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        int total = 0;
        
        if (inicio == fim) {
            total = 24;
        } else if (inicio > fim) {
            fim = fim + 24;
            total = fim - inicio;
        } else {
            total = fim - inicio;
        }
        
        System.out.println("O JOGO DUROU " + total + " HORA(S)");
        
        sc.close();
        
    }
 
}