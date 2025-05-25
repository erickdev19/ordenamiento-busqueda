public class MergeSort {

    // Método principal que el usuario puede usar
    public static void ordenar(int[] arreglo) {
        if (arreglo == null || arreglo.length < 2) return;
        mergeSort(arreglo, 0, arreglo.length - 1);
    }

    private static void mergeSort(int[] arreglo, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;

            // Dividir recursivamente
            mergeSort(arreglo, izquierda, medio);
            mergeSort(arreglo, medio + 1, derecha);

            // Combinar
            merge(arreglo, izquierda, medio, derecha);
        }
    }

    private static void merge(int[] arreglo, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        int[] izquierdaTemp = new int[n1];
        int[] derechaTemp = new int[n2];

        // Copiar datos temporales
        for (int i = 0; i < n1; ++i)
            izquierdaTemp[i] = arreglo[izquierda + i];
        for (int j = 0; j < n2; ++j)
            derechaTemp[j] = arreglo[medio + 1 + j];

        // Mezclar arreglos temporales
        int i = 0, j = 0, k = izquierda;

        while (i < n1 && j < n2) {
            if (izquierdaTemp[i] <= derechaTemp[j]) {
                arreglo[k] = izquierdaTemp[i];
                i++;
            } else {
                arreglo[k] = derechaTemp[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes
        while (i < n1) {
            arreglo[k] = izquierdaTemp[i];
            i++;
            k++;
        }
        while (j < n2) {
            arreglo[k] = derechaTemp[j];
            j++;
            k++;
        }
    }
}