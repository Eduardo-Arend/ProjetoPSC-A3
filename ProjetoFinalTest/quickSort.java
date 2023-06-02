package ProjetoFinalTest;

public class quickSort extends MainTest {
    
    public void QuickSort(Long[] modoQuick) {
        QuickSort(modoQuick, 0, modoQuick.length - 1);
    }
    
    public void QuickSort(Long[] modoQuick, int inicio, int fim) {
        if (inicio < fim) {
            int indexPivo = dividir(modoQuick, inicio, fim);
            QuickSort(modoQuick, inicio, indexPivo - 1);
            QuickSort(modoQuick, indexPivo + 1, fim);
        }
    }
    
    public int dividir(Long[] modoQuick, int inicio, int fim) {
        Long pivo;
        int pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = modoQuick[inicio];
        
        while (pontEsq <= pontDir) {
            while (pontEsq <= pontDir && modoQuick[pontEsq] <= pivo) {
                pontEsq++;
            }
            while (pontDir >= pontEsq && modoQuick[pontDir] > pivo) {
                pontDir--;
            }
            if (pontEsq <= pontDir) {
                trocar(modoQuick, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }
        
        trocar(modoQuick, inicio, pontDir);
        return pontDir;
    }
    
    public void trocar(Long[] modoQuick, int i, int j) {
        Long temp = modoQuick[i];
        modoQuick[i] = modoQuick[j];
        modoQuick[j] = temp;
    }
}
