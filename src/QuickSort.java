

public class QuickSort {

    /**
     * Metodo principal de QuickSort
     * Ordena un array de enteros en el rango [primer numero de izquerda, ultimo numero de la derecha]
     * Complejidad promedio: O(n log n)
     * Peor caso (cuando el valor de particion es el mínimo o máximo): O(n^2)
     */
    public static void quickSort(int[] arr, int izquierda, int derecha){
        if(izquierda < derecha) {
            int indiceParticion = particion(arr, izquierda, derecha);

            quickSort(arr, izquierda, indiceParticion - 1);
            quickSort(arr, indiceParticion + 1, derecha);
        }
    }
    /**
     * Metodo para dividir el array y encontrar el punto de partición
     * Elige el último elemento como pivote (derecha)
     */
    private static int particion(int[] arr, int izquierda, int derecha){
        int pivote = arr[derecha];
        int i = izquierda - 1;

        for (int j = izquierda; j < derecha; j++){
            if(arr[j] < pivote){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[derecha];
        arr[derecha] = temp;
    //retornamos el indice de particion
        return i + 1;
    }
}
