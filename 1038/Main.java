import java.io.IOException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Locale;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Map<Integer, Double> cardapio = new HashMap<>();
        
        cardapio.put(1, 4.00);
        cardapio.put(2, 4.50) ;       
        cardapio.put(3, 5.00) ;
        cardapio.put(4, 2.00);
        cardapio.put(5, 1.50) ;
        
        String[] valores = sc.nextLine().split(" ");
        
        int ent = Integer.parseInt(valores[0]);
        int qtde = Integer.parseInt(valores[1]);
        
        double uni = cardapio.get(ent);
        double total = uni * qtde;
        
        System.out.printf("Total: R$ %.2f\n", total);
        
        sc.close();
        
        
        
        
    }
 
}