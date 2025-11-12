import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double sal = sc.nextDouble();
        double bonus = 0;
        
        if (sal <= 400) {
            bonus = 0.15;
        } else if (sal <= 800) {
            bonus = 0.12;
        } else if (sal <= 1200) {
            bonus = 0.10;
        } else if (sal <= 2000) {
            bonus = 0.07;
        } else {
            bonus = 0.04;
        }
        
        double reajuste = sal * bonus;
        double novo = sal + reajuste;
        int percent = (int) (bonus * 100);
        
        System.out.printf("Novo salario: %.2f\n", novo);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percent);
                        
        sc.close();
        
        
    }
 
}