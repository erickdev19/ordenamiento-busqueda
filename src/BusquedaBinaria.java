

public class BusquedaBinaria {
    /**
     * Realizamos la búsqueda binaria en nuestro arreglo ordenado
     * @param arr - Arreglo ordenado de enteros
     * @param clave - Número que se quiere buscar
     * @return true si se encuentra la clave, false si no
     *
     * Complejidad algorítmica: O(log n)  porque en cada paso se descarta la mitad del array.
     */

    public static boolean buscar(int[] arr, int clave){
        int izquierda = 0;
        int derecha = arr.length - 1;

        while (izquierda <= derecha){
            //localizar el indice del medio
            int medio = (izquierda + derecha) / 2;

            //buscamos la clave primero comparamos con el valor del indice medio y luego a la izquierda o derecha si no se encuentra
            if(arr[medio] == clave){
                return true;
            } else if (arr[medio] < clave ){
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
    return false;
    }

}
