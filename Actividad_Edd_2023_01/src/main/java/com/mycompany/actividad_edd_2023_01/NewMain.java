package com.mycompany.actividad_edd_2023_01;


/*This code is contributed by Rajat Mishra */
public class NewMain {

    //Metodo Burbuja
    public static void metodoBurbuja(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }

        }

    }

    //Metodo inserción
    public static void metodoInsercion(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int temporal = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > temporal) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = temporal;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    //Metodo selección
    public static void metodoSeleccion(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = temporal;
                }
            }
        }
        for (int var : arreglo) {
            System.out.print(var + " ");
        }
    }

    //Metodo Shell
    public static void metodoShell(int arreglo[]) {
        int salto, aux;
        boolean cambios;
        for (salto = arreglo.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (int i = salto; i < arreglo.length; i++) {
                    if (arreglo[i - salto] > arreglo[i]) {
                        aux = arreglo[i];
                        arreglo[i] = arreglo[i - salto];
                        arreglo[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    //metodo merge
//    public static void sort(int arr[], int left, int right) {
//        if (left < right) {
//            int middle = (left + right) / 2;
//            sort(arr, left, middle);
//            sort(arr, middle + 1, right);
//            merge(arr, left, middle, right);
//        }
//    }
//
//    public static void merge(int arr[], int left, int middle, int right) {
//        int n1 = middle - left + 1;
//        int n2 = right - middle;
//        int leftArray[] = new int[n1];
//        int rightArray[] = new int[n2];
//        for (int i = 0; i < n1; i++) {
//            leftArray[i] = arr[left + i];
//        }
//        for (int j = 0; i < n2; j++) {
//            rightArray[j] = arr[middle + j + 1];
//        }
//        int i = 0, j = 0;
//        int k = left;
//        while (i < n1 && j < n2) {
//            if (leftArray[i] <= rightArray[j]) {
//                arr[k] = leftArray[i];
//                i++;
//            } else {
//                arr[k] = rightArray[j];
//                j++;
//            }
//            k++;
//        }
//        while (i < n1) {
//            arr[k] = leftArray[i];
//            i++;
//            k++;
//        }
//        while (j < n2) {
//            arr[k] = rightArray[j];
//            j++;
//            k++;
//        }
//        for (int l = 0; l < arr.length; l++) {
//            System.out.println(arr[i]);
//        }
//    }
//
//    public static void printArray(int arr[]) {
//        int n = arr.length;
//        for (int i = 0; i < n; ++i) {
//            System.out.println(arr[i] + " ");
//        }
//        System.out.println();
//    }
//        int n = arregloNumero.length;
//        sort(arregloNumero, 0, n - 1);
//        printArray(arregloNumero);
    public static void main(String[] args) {

        int arregloNumero[] = {23, 18, 495, 90, 67, 999, 405};
        //metodoBurbuja(arregloNumero);
        //metodoInsercion(arregloNumero);
        //metodoSeleccion(arregloNumero);
        //metodoShell(arregloNumero);
    }

}
