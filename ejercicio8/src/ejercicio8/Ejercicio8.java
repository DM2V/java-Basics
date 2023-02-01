package ejercicio8;

/**
 *
 * @author marce
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        //Crear un objeto persona en el main.
        Persona persona1 = new Persona();

        //Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
        //por último muéstralas por consola.
        persona1.setEdad(23);
        persona1.setNombre("Marcelo");
        persona1.setTelefono("0992552112");

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Telefono: " + persona1.getTelefono());
    }
}

//Crear clase Persona.
//Crear variables las privadas edad, nombre y telefono de la clase Persona.
//Crear gets y sets de cada propiedad.
class Persona {

    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
