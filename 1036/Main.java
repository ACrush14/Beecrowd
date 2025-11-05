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
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();        
        
        double bas = (B * B) - (4 * A * C);
        
        if (bas < 0 || A == 0) {
            System.out.println("Impossivel calcular");
        }
        else {
            bas = Math.sqrt(bas);
            double R1 = (-B + bas) / (2 * A);
            double R2 = (-B - bas) / (2 * A);
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);  
        }
        sc.close();
    }
}