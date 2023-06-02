package ProjetoFinalTest;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        // TODO code application logic here

        File file = new File("C:\\projeto Final\\Teste.txt");
        Scanner sc = null;

        Date horaInicio = new Date();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String dataFormatadaInicial = dateFormat.format(horaInicio);

        System.out.println("Date em String formatada: " + dataFormatadaInicial);
        System.out.println("");

        List<Long> numeros = new ArrayList<>();
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                numeros.add(Long.parseLong(line));
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

        Long[] arr = new Long[numeros.size()];
        insertionSort(numeros.toArray(arr));

        System.out.println("Array sorted using Insertion Sort:");
        for (Long num : arr) {
            System.out.print(num + "\r\n");
        }
    }

    public static void insertionSort(Long[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Long key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
