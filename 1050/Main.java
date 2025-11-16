import java.io.IOException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        Map<Integer, String> ddd = new HashMap<>();
        ddd.put(61, "Brasilia");
        ddd.put(71, "Salvador");
        ddd.put(11, "Sao Paulo");
        ddd.put(21, "Rio de Janeiro");
        ddd.put(32, "Juiz de Fora");
        ddd.put(19, "Campinas");
        ddd.put(27, "Vitoria");
        ddd.put(31, "Belo Horizonte");
        
        
        int a = sc.nextInt();
        
        
        
        if (ddd.get(a) != null) {
            System.out.println(ddd.get(a));
        } else {
            System.out.println("DDD nao cadastrado");
        }
        
        sc.close();
        
        
    }
 
}