public class Cocinero {
    String nombre, especialidad;
    int experiencia;

    public Cocinero(String nombre, String especialidad, int experiencia) {
        this.nombre=nombre;
        this.especialidad=especialidad;
        this.experiencia=experiencia;
    }

    public void mostrarinfo(){
        System.out.println("INFORMACION");
        System.out.println("Nombre: "+nombre);
        System.out.println("Especialidad: "+especialidad);
        System.out.println("Años de experiencia: "+experiencia);
        System.out.println("");
    }
}

