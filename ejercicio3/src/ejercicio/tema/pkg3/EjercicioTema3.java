/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.tema.pkg3;

import org.w3c.dom.events.MutationEvent;

/**
 *
 * @author marce
 */

/*
    Primera parte:

    - Crear una función con tres parámetros que sean números que se suman entre sí.
    - Llamar a la función en el main y darle valores.

    Segunda parte:
    - Crear una clase coche.
    - Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    - Una función que incremente el número de puertas que tiene el coche.
    
    - Crear un objeto miCoche en el main y añadirle una puerta.
    - Mostrar el número de puertas que tiene el objeto.
 */
public class EjercicioTema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exercise Topic 3");

        //First Part
        System.out.println("Result: " + additionNumbers(10, 20, 5));

        //Second Part
        Car myCar = new Car();
        myCar.numberDoors = 5;
        System.out.println("Number of Doors: "+ myCar.numberDoors);

    }

    public static int additionNumbers(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

}
