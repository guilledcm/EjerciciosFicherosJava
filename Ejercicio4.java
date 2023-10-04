import java.io.*;
/*Cuarto ejercicio añadir el contenido de un fichero a otro ya existente.*/
public class Ejercicio4 {
    public static void main(String[] args) {
        String archivoOrigen = "";
        String archivoDestino = "";

        try {
            BufferedReader bf = new BufferedReader(new FileReader(archivoOrigen));
            String linea;
            while ((linea = bf.readLine()) != null) {

            }
            bf.close();
            System.out.println("Contenido agregado exitosamente al archivo destino.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
