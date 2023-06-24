package ProjetoFinalTest;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainTest extends insertionSort {
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
            List<Long> modoInsertion = new ArrayList<>();
            List<Long> modoQuick = new ArrayList<>();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                modoInsertion.add(Long.parseLong(line));

                try {
                    Long number = Long.parseLong(line);
                    modoQuick.add(number);
                } catch (NumberFormatException e) {
                }
            }
            Long[] numerosArray = modoQuick.toArray(new Long[0]);
            quickSort sorter = new quickSort();
            sorter.QuickSort(numerosArray);

            System.out.println("Array sorted using QuickSort:");
            for (Long number : numerosArray) {
                System.out.println(number);
            }
            Long[] arr = new Long[modoInsertion.size()];
            InsertionSort(modoInsertion.toArray(arr));

            System.out.println("Array sorted using Insertion Sort:");
            for (Long num : arr) {
                System.out.print(num + "\r\n");
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
}
