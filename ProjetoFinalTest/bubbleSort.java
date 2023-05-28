package ProjetoFinalTest;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class bubbleSort{
    public static void main(String[] args) {
        File file = new File("/Users/eduardapaimdasilva/Documents/Ordenacao/testProjeto.txt");
        Scanner sc = null;

        


        Date horaInicio = new Date();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String dataFormatadaInicial = dateFormat.format(horaInicio);

        System.out.println("Date em String formatada: " + dataFormatadaInicial);
        System.out.println("");

        try {
            sc = new Scanner(file);
            String[] lines = new String[0];
            int count = 0;

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lines = expandArray(lines);
                lines[count] = line;
                count++;
            }

            bubbleSort(lines);

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
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

    protected static String[] expandArray(String[] array) {
        int length = array.length;
        String[] newArray = new String[length + 1];
        System.arraycopy(array, 0, newArray, 0, length);
        return newArray;
    }

    private static void bubbleSort(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Troca os elementos
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
