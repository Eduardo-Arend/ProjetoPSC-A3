package ProjetoFinalTest;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class insertionSort extends MainTest{
    int [] arr = new int[10];
    /**
     * 
     */
    insertionSort(arr);

    System.out.println("Array sorted using Insertion Sort:");
    for (int num : arr) {
        System.out.print(num + " ");
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
    
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}


