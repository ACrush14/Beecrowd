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
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();        
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();
        
        n1 = n1 *2;
        n2 = n2 * 3;
        n3 = n3 * 4 ;       
        
        float media = (n1 + n2 + n3 + n4) / 10;
        
        System.out.printf("Media: %.1f\n", media);
        
        if (media < 5) {
             System.out.println("Aluno reprovado.");
        } else if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno em exame.") ;
            
            float n5 = sc.nextFloat();
            
            System.out.printf("Nota do exame: %.1f\n", n5);
            
            float n_media = (media + n5) / 2;
            
                if (n_media < 5) {
                    System.out.println("Aluno reprovado.");
                } else {
                    System.out.println("Aluno aprovado.");
                }
                
                System.out.printf("Media final: %.1f\n", n_media);
    
                }
        sc.close();
 
    }
 
}