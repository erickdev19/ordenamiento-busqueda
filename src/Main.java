import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//1. como primer paso generamos el arreglo de numeros aleatorios
        int[] numeros = GeneradorNumeros.generarArray();

        //2. seleccionamos y guardamos la clave magica seleccionando un numero
        int claveMagica = GeneradorNumeros.selecClave(numeros);
        //Nota: descomentar este sout para probar con la clave correcta
        //System.out.println(claveMagica);

        //3. ordenamos el arreglo con quick sort y vemos su tiempo de ejecucion
        long tiempoInicioOrdenamiento = System.nanoTime();
        QuickSort.quickSort(numeros, 0, numeros.length - 1);
        long tiempoFinOrdenamiento = System.nanoTime();
        long duracionOrdenamiento = tiempoFinOrdenamiento - tiempoInicioOrdenamiento;

        //4. ahora vamos a solicitar la clave al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("⚪️ Ingresa la clave mágica de 4 dígitos para hablar con este oráculo: ");
        int claveUsuario = scanner.nextInt();

        //5. ahora buscamos esa clave con binary search
        long tiempoInicioBusqueda = System.nanoTime();
        boolean encontrado = BusquedaBinaria.buscar(numeros, claveUsuario);
        long tiempoFinBusqueda = System.nanoTime();
        long duracionBusqueda = tiempoFinBusqueda - tiempoInicioBusqueda;

        //6. finalmente se muestra al usuario si le atinó a la clave mágica o no
        if(encontrado && claveUsuario == claveMagica){
            System.out.println("🔮OH MAGO! El oráculo ha accedido a concederte la respuesta que buscas:");
            System.out.println(Mensajes.obtenerMensaje());
        } else if (encontrado){
            System.out.println("⚪️Mago, tu clave parece existir, pero no pertenece a este oráculo.");
        } else {
            System.out.println("⚫️Usurpador! No hay oráculo en el mundo místico que contenga tal clave.");
        }

        //como extra mostramos el análisis de tiempo de ejecucion
        System.out.println("\n⏳️ Tiempo de ordenamiento en nanosegundos: " + duracionOrdenamiento);
        System.out.println("⏳️ Tiempo de búsqueda en nanosegundos: " + duracionBusqueda);
    }
    }

