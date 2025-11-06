import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int[] original = {a, b, c};
        int[] ordenados = {a, b, c};
        
        Arrays.sort(ordenados);
        
        System.out.println(ordenados[0]);
        System.out.println(ordenados[1]);
        System.out.println(ordenados[2]);
        
        System.out.println();
        
        System.out.println(original[0]);
        System.out.println(original[1]);
        System.out.println(original[2]);        
 
    }
 
}