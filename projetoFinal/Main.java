/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoFinal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        
        File file = new File("/Users/eduardapaimdasilva/Documents/Ordenacao/testProjeto.txt");
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
