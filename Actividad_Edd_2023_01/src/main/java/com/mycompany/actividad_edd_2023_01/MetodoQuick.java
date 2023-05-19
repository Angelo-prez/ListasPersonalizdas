package com.mycompany.actividad_edd_2023_01;

/**
 *
 * @author USUARIO
 */
public class MetodoQuick {

    public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void ImprimirArray(int arreglo[]) {
        for (int i = 0; i < arreglo.length; ++i) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arregloNumero[] = {23, 18, 495, 90, 67, 999, 405};
        int n = arregloNumero.length;
        MetodoQuick var1 = new MetodoQuick();
        var1.sort(arregloNumero, 0, n - 1);
        ImprimirArray(arregloNumero);
    }
}
