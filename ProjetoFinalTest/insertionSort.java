package ProjetoFinalTest;


public class insertionSort  {

    public static void InsertionSort(Long[] arr) {
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
