import java.util.Random;
import java.util.Arrays;

public class GeneradorNumeros {

    private int[] numerosRandom;
    private int claveMagica;

    // Constructor: genera lista y selecciona la clave automáticamente
    public GeneradorNumeros() {
        claveGenerator();     // Generar lista de números
        selectMagicKey();     // Seleccionar clave mágica
    }

    // Genera 1000 números aleatorios entre 1000 y 9999
    private void claveGenerator() {
        Random random = new Random();
        numerosRandom = new int[1000];

        for (int i = 0; i < 1000; i++) {
            numerosRandom[i] = random.nextInt(9000) + 1000;
        }
        //Los ordena
    }

    // Elige un número aleatorio de la lista como la clave mágica
    private void selectMagicKey() {
        Random random = new Random();
        int indice = random.nextInt(numerosRandom.length); // índice válido
        claveMagica = numerosRandom[indice];

    }

    @Override
    public String toString() {
        return Arrays.toString(numerosRandom) +
                "\n🔐 Clave Mágica: " + claveMagica;
    }

    public int getClaveMagica() {
        return claveMagica;
    }

    public int[] getLista() {
        return numerosRandom;
    }
}