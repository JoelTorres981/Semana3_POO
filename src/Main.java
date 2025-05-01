import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre, especialidad;
        int experiencia;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese informacion");
        System.out.println("Nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Especialidad: ");
        especialidad = scanner.nextLine();
        System.out.println("Experiencia: ");
        experiencia = scanner.nextInt();

        Cocinero cocinero = new Cocinero(nombre,especialidad,experiencia);

        cocinero.mostrarinfo();
    }
}