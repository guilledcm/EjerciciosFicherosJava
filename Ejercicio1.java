import java.io.*;


/*Primer ejercicio, leer un archivo y contar las palabras que tiene*/
public class Ejercicio1 {
    public static void main(String[] args) {
        String ruta = "H://DAM-GS-2º Guillermo De Carlos Muñoz//Acceso a Datos//UnidadFullFicheros//EjerciciosFullFicheros//Archivo.txt";
        File fichero = new File(ruta);
        FileReader fr;
        BufferedReader bf;
        int contadorPalabras = 0;
        try {
            String linea;
            fr = new FileReader(fichero);
            bf = new BufferedReader(fr);
            while ((linea = bf.readLine()) != null) {
                String[] palabras = linea.split(" ");
                contadorPalabras += palabras.length;
            }

        }catch (FileNotFoundException fe){
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}