import java.io.IOException;
import java.util.Scanner; 
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int valor = sc.nextInt();
        
        System.out.println(valor);
        
        int cont100 = 0;
        int cont50 = 0;
        int cont20 = 0;
        int cont10 = 0;
        int cont5 = 0;
        int cont2 = 0;
        int cont1 = 0;
        
        while (valor >= 100){
            valor -= 100;
            cont100+= 1;
        }
 
        while (valor >= 50){
            valor -= 50;
            cont50+= 1;
        }
            
        while (valor >= 20){
            valor -= 20;
            cont20+= 1;
        }
            
        while (valor >= 10){
            valor -= 10;
            cont10+= 1;
        }
            
        while (valor >= 5){
            valor -= 5;
            cont5+= 1;
        }    
        while (valor >= 2){
            valor -= 2;
            cont2+= 1;
        }
        while (valor >= 1){
            valor -= 1;
            cont1+= 1;
        }
        System.out.println(cont100 + " nota(s) de R$ 100,00");
        System.out.println(cont50 + " nota(s) de R$ 50,00");
        System.out.println(cont20 + " nota(s) de R$ 20,00");
        System.out.println(cont10 + " nota(s) de R$ 10,00"); 
        System.out.println(cont5 + " nota(s) de R$ 5,00");
        System.out.println(cont2 + " nota(s) de R$ 2,00"); 
        System.out.println(cont1 + " nota(s) de R$ 1,00");
        
        sc.close();

    }
 
}