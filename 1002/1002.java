import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double π = 3.14159;
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double area = π * raio * raio;
        
        System.out.printf("A=%.4f%n", area);
        
        sc.close();
 
    }
 
}