import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*Tercer ejercicio leer un archivo y borrar todos los espacios y construir un nuevo archivo*/
public class Ejercicio3 {
        public static void main(String[] args) {
            String rutaEntrada = "F://DAM-GS-2º Guillermo De Carlos Muñoz//Acceso a Datos//UnidadFullFicheros//EjerciciosFullFicheros//Archivo.txt";
            String rutaSalida = "F://DAM-GS-2º Guillermo De Carlos Muñoz//Acceso a Datos//UnidadFullFicheros//EjerciciosFullFicheros//SalidaArchivo.txt";

            try {
                BufferedReader bf = new BufferedReader(new FileReader(rutaEntrada));
                BufferedWriter bw = new BufferedWriter(new FileWriter(rutaSalida));

                String linea;
                while ((linea = bf.readLine()) != null) {
                    String lineaSinEspacios = linea.replaceAll("\\s+", "");
                    bw.write(lineaSinEspacios);
                    bw.newLine();
                }
                bf.close();
                bw.close();
                System.out.println("Espacios eliminados y nuevo archivo creado con éxito.");
            } catch (IOException e) {
                System.err.println("Error al procesar el archivo: " + e.getMessage());
            }
        }
}
