import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*Segundo ejercicio Busca y remplaza una palabra que se meta por consola en el archivo
que se indique como segundo parametro*/
public class Ejercicio2 {
    public static void main(String[] args) {
        String ruta = "F://DAM-GS-2º Guillermo De Carlos Muñoz//Acceso a Datos//UnidadFullFicheros//EjerciciosFullFicheros//Archivo.txt";
        String rutaSalida="F://DAM-GS-2º Guillermo De Carlos Muñoz//Acceso a Datos//UnidadFullFicheros//EjerciciosFullFicheros//SalidaArchivo.txt";
        Scanner sc;
        String palabra;
        String remplazo;
        ArrayList<String> datos = new ArrayList<>();
        ArrayList<String> datosFinal = new ArrayList<>();

        try {
            Scanner leer = new Scanner(new File(ruta));
            while (leer.hasNext()) {
                datos.add(leer.next());
            }
            leer.close();
        } catch (FileNotFoundException f) {
            System.out.println("No se ha podido leer el archivo");
            System.exit(1);
        }

        sc = new Scanner(System.in);
        System.out.println("Dame la palabra que quieras reemplazar");
        palabra = sc.next();
        System.out.println("Dame la palabra de reemplazo");
        remplazo = sc.next();

        for (String s : datos) {
            if (s.equals(palabra)) {
                datosFinal.add(remplazo);
            } else {
                datosFinal.add(s);
            }
        }

        System.out.println("Datos originales: " + datos.toString());
        System.out.println("Datos finales: " + datosFinal.toString());

        try {
            FileWriter writer = new FileWriter(rutaSalida);
            for (String s : datosFinal) {
                writer.write(s + " ");
            }
            writer.close();
            System.out.println("Reemplazo completado y guardado en el archivo.");
        } catch (IOException e) {
            System.out.println("No se pudo escribir en el archivo.");
        }
    }
}
