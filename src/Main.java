import javax.swing.JOptionPane;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Traemos las variables clave y array de numeros del Generador de numeros
        GeneradorNumeros generador = new GeneradorNumeros();
        int[] numerosRandom = generador.getLista();
        int clave = generador.getClaveMagica();
        Trampa: System.out.println("Lista desordenada: \n" + Arrays.toString(numerosRandom));

        //Ordenamos el arreglo con quick sort y guardamos su tiempo de ejecucion
        long tiempoInicioOrdenamiento = System.nanoTime();
        QuickSort.quickSort(numerosRandom, 0, numerosRandom.length - 1);
        long tiempoFinOrdenamiento = System.nanoTime();
        long duracionOrdenamiento = tiempoFinOrdenamiento - tiempoInicioOrdenamiento;
        Trampa: System.out.println("Lista ordenada: \n" + generador);

        // Ordenamos el arreglo con merge sort y guardamos su tiempo de ejecucion (EXTRA)
        long tiempoInicioOrdenamientoM = System.nanoTime();
        MergeSort.ordenar(numerosRandom);
        long tiempoFinOrdenamientoM = System.nanoTime();
        long duracionOrdenamientoM = tiempoFinOrdenamientoM - tiempoInicioOrdenamientoM;

        boolean acertado = false;

        // Interfaz del oraculo
        while (!acertado) {
            // Pedir valores
            String input = JOptionPane.showInputDialog(null,
                    "Ingresa la clave mágica de 4 dígitos para hablar con este oráculo: ");

            // Salir si presiona el boton cancelar
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Juego cancelado.");
                return;
            }

            try {
                int intentoUsuario = Integer.parseInt(input);

                // Validar rango permitido
                if (intentoUsuario < 1000 || intentoUsuario > 9999) {
                    JOptionPane.showMessageDialog(null,
                            "⚠️ Por favor ingrese una clave de 4 digitos.");
                    continue; // No cuenta como intento
                }
                // Ahora buscamos esa clave con binary search
                long tiempoInicioBusqueda = System.nanoTime();
                boolean encontrado = BusquedaBinaria.buscar(numerosRandom, intentoUsuario);
                long tiempoFinBusqueda = System.nanoTime();
                long duracionBusqueda = tiempoFinBusqueda - tiempoInicioBusqueda;

                if(encontrado && intentoUsuario == clave){
                    JOptionPane.showMessageDialog(null,
                            "🔮 OH MAGO! El oráculo ha accedido a concederte la respuesta que buscas:");
                    JOptionPane.showMessageDialog(null,Mensajes.obtenerMensaje());

                    // Como extra mostramos el análisis de tiempo de ejecucion
                    System.out.println("\n TIEMPO DE ORDENAMIENTO QUICK SORT: ");
                    System.out.println("⏳️ Tiempo de ordenamiento en nanosegundos: " + duracionOrdenamiento);
                    System.out.printf("⏱️ Tiempo de ordenamiento en segundos: %.6f s%n", duracionOrdenamiento / 1_000_000_000.0);

                    System.out.println("\n TIEMPO DE ORDENAMIENTO MERGE SORT: ");
                    System.out.println("⏳️ Tiempo de ordenamiento en nanosegundos: " + duracionOrdenamientoM);
                    System.out.printf("⏱️ Tiempo de ordenamiento en segundos: %.6f s%n", duracionOrdenamientoM / 1_000_000_000.0);

                    System.out.println("\n⏳️ Tiempo de búsqueda en nanosegundos: " + duracionBusqueda);
                    System.out.printf("⏱️ Tiempo de búsqueda en segundos: %.6f s%n", duracionBusqueda / 1_000_000_000.0);
                    acertado = true;
                } else if (encontrado){
                    JOptionPane.showMessageDialog(null,
                            "⚪️ Mago, tu clave parece existir, pero no pertenece a este oráculo.");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "⚫️ Usurpador! No hay oráculo en el mundo místico que contenga tal clave.");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "❌ Por favor, ingresa un número válido.");
            }
        }

    }
}
