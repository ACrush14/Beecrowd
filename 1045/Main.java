import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        
        
        float[] valores = {n1, n2, n3};
        
        Arrays.sort(valores);
        
        float a = valores[2];
        float b = valores[1];
        float c = valores[0];
        
        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if ((a*a) == (b*b) + (c*c)) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (a*a > (b*b) + (c*c)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if ( a*a < (b*b) + (c*c)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if ((a == b) && (a == c) && (b == c)) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || a == c || b == c ) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        
        sc.close();
 
    }
 
}