package ProjetoFinalTest;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        
        File file = new File("C:\\projeto Final\\Teste.txt");
        Scanner sc = null;


        Date horaInicio = new Date();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String dataFormatadaInicial = dateFormat.format(horaInicio);

        System.out.println("Date em String formatada: " + dataFormatadaInicial);
        System.out.println("");
        
        try {
        sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (sc != null) {
            sc.close();
            }
        }
        
        Date horaFinal = new Date();
        DateFormat dateFormatF = new SimpleDateFormat("HH:mm:ss");
        String dataFormatadaFinal = dateFormatF.format(horaFinal);
        
        System.out.println("");
        System.out.println("Date em String formatada: " + dataFormatadaFinal);

    }
 }