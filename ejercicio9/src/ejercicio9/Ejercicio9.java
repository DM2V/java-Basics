package ejercicio9;

/**
 *
 * @author marce
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        //Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
        //el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
        Cliente cliente1 = new Cliente();
        cliente1.edad = 23;
        cliente1.telefono = "0998636368";
        cliente1.nombre = "Marcelo";
        cliente1.credito = 50000;
        System.out.println("Nombre: " + cliente1.nombre);
        System.out.println("Edad: " + cliente1.edad);
        System.out.println("Telefono: " + cliente1.telefono);
        System.out.println("Credito: " + cliente1.credito);

        //Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
        //y con una variable salario que solo tenga la clase Trabajador.
        Trabajador trabajador1 = new Trabajador();
        trabajador1.edad = 33;
        trabajador1.telefono = "0991256123";
        trabajador1.nombre = "Kevin";
        trabajador1.salario = 450.26;
        System.out.println("Nombre: " + trabajador1.nombre);
        System.out.println("Edad: " + trabajador1.edad);
        System.out.println("Telefono: " + trabajador1.telefono);
        System.out.println("Salario: " + trabajador1.salario);

    }

}

/*
    Crea una clase Persona con las siguientes variables:
    La edad, El nombre, El teléfono
 */
class Persona {

    int edad;
    String nombre;
    String telefono;
}

//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
//esta nueva clase tendrá la variable credito solo para esa clase.
class Cliente extends Persona {

    int credito;
}

class Trabajador extends Persona {

    double salario;
}
