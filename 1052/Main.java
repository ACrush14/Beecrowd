import java.io.IOException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        Map<Integer, String> mes = new HashMap<>();
        mes.put(1, "January");
        mes.put(2, "February");
        mes.put(3, "March");
        mes.put(4, "April");
        mes.put(5, "May");
        mes.put(6, "June");
        mes.put(7, "July");
        mes.put(8, "August");
        mes.put(9, "September");
        mes.put(10, "October");
        mes.put(11, "November");
        mes.put(12, "December");
        
        
        int a = sc.nextInt();
        
        if (mes.get(a) != null) {
            System.out.println(mes.get(a));
        }
        
        sc.close();
        
        
    }
 
}