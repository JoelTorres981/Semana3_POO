import java.lang.classfile.attribute.CompilationIDAttribute;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre, especialidad;
        int experiencia;

        Scanner scanner = new Scanner(System.in);
        Cocinero[] cocineros = new Cocinero[3];

        for (int i = 0; i < cocineros.length; i++) {
            System.out.println("Ingrese informacion");
            System.out.println("Nombre: ");
            nombre = scanner.nextLine();
            System.out.println("Especialidad: ");
            especialidad = scanner.nextLine();
            System.out.println("Experiencia: ");
            experiencia = scanner.nextInt();
            scanner.nextLine();
            cocineros[i] = new Cocinero(nombre,especialidad,experiencia);
        }

        for (int i = 0; i < cocineros.length; i++) {
            cocineros[i].mostrarinfo();
            System.out.println(" ");
        }

    }
}