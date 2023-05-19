package com.mycompany.actividad_edd_2023_01;

public class MetodoHeap {

    public void sort(int arreglo[]) {
        int x = arreglo.length;
        for (int i = x / 2 - 1; i >= 0; i--) {
            heapify(arreglo, x, i);
        }
        for (int i = x - 1; i >= 0; i--) {
            int temporal = arreglo[0];
            arreglo[0] = arreglo[i];
            arreglo[i] = temporal;
            heapify(arreglo, i, 0);
        }
    }

    void heapify(int arreglo[], int n, int i) {
        int largest = i;
        int izq = 2 * i + 1;
        int der = 2 * i + 2;
        if (izq < n && arreglo[izq] > arreglo[largest]) {
            largest = izq;
        }
        if (der < n && arreglo[der] > arreglo[largest]) {
            largest = der;
        }
        if (largest != i) {
            int swap = arreglo[i];
            arreglo[i] = arreglo[largest];
            arreglo[largest] = swap;
            heapify(arreglo, n, largest);
        }
    }

    static void ImprimirArreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; ++i) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arreglo[] = {67,34,2,5,8,123};
        int n = arreglo.length;
        MetodoHeap var1 = new MetodoHeap();
        var1.sort(arreglo);
        ImprimirArreglo(arreglo);
    }

}
