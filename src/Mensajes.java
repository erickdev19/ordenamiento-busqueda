import java.util.Random;

public class Mensajes {

    private static final String[] MensajesSecretos = {
            "🗝️ El portal al reino sumergido se abrirá cuando el sol cruce la cima del monte hueco.",
            "📜 Bajo la tercera luna de piedra, encontrarás la biblioteca olvidada del conocimiento prohibido.",
            "📕 El mapa del tesoro está oculto en la última página del códice rojo, sellado por el sabio Alerion.",
            "🧭 Sigue la constelación del Cuervo Dorado y hallarás la entrada al santuario secreto.",
            "🏰 El trono del antiguo imperio yace bajo las ruinas del castillo de obsidiana."
    };
    /**
     * Metodo que devuelve un mensaje secreto random si se acierta la clave mágica.
     * @return String - mensaje secreto
     */

    public static String obtenerMensaje(){
        Random random = new Random();
        int indice = random.nextInt(MensajesSecretos.length);
        return MensajesSecretos[indice];
    }
}
