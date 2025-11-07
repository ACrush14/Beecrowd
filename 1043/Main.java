import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        
        float valor = a+b+c;
        float area = ((a+b) * c) / 2;
        
        if ((a < b+c) && (b < a+c) && (c < a+b)) {
            System.out.printf("Perimetro = %.1f\n", valor);
        } else {
            System.out.printf("Area = %.1f\n", area);
        }
        sc.close();
    }
 
}