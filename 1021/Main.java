import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double num = sc.nextDouble();
        
        int valor = (int) Math.floor((num * 100) + 0.5);
        
        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};
        
        System.out.println("NOTAS:");
        for (int i : notas) {
            int qtde = valor / i;
            valor = valor % i;
            
            System.out.printf("%d nota(s) de R$ %.2f\n", qtde, i / 100.0);
            
        }
        
        System.out.println("MOEDAS:");
        for (int i : moedas) {
            int qtde = valor / i;
            valor = valor % i;
            
            System.out.printf("%d moeda(s) de R$ %.2f\n", qtde, i / 100.0);
        }
        sc.close();   
 
    }
 
}