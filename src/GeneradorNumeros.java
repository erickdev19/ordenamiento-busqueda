

public class GeneradorNumeros {

//Metodo para generar el array con números entre 1000 y 9999
    public static int[] generarArray(){
        int[] arrayRandom = new int[1000];

        for (int i = 0; i < arrayRandom.length; i++){
            arrayRandom[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arrayRandom;
    }

//Metodo para devolver el valor de un indice al azar del array de 1000 claves diferente
public static int selecClave(int[] arrayRandom){
        int indice = (int)(Math.random() * arrayRandom.length);
        return arrayRandom[indice];
}
}
