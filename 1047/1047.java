import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int horaInicial = sc.nextInt();
        int minInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minFinal = sc.nextInt();
        
        int totalInicial = horaInicial * 60 + minInicial;
        int totalFinal = horaFinal * 60 + minFinal;
        
        int totalMinutos = 0;
        
        if (totalInicial == totalFinal) {
            totalMinutos = 24*60;
        } else if (totalInicial < totalFinal) {
            totalMinutos = totalFinal - totalInicial;
        } else {
            totalMinutos = (totalFinal + 24 *60) - totalInicial;
        }
        
        int hTotal = totalMinutos / 60;
        int mTotal = totalMinutos % 60;
        
        System.out.println("O JOGO DUROU " + hTotal + " HORA(S) E " + mTotal + " MINUTO(S)");

        sc.close();

    }
 
}