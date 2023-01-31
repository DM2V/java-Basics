package ejer4;

/**
 *
 * @author marce
 */
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        int numeroIf = 10;
        System.out.println("numeroIf = " + numeroIf);
        if (numeroIf == 0) {
            System.out.println("La variable numeroIf es cero");
        } else if (numeroIf > 0) {
            System.out.println("La variable numeroIf es positivo");
        } else {
            System.out.println("La variable numeroIf es negativo");
        }

        /*
        Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        el bloque de código que tendrá el bucle deberá:
            * Incrementar el valor de la variable en uno cada vez que se ejecute.
            * Mostrarlo por pantalla cada vez que se ejecute.
         */
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile: " + numeroWhile);
        }

        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        do {
            numeroWhile++;
            System.out.println("numeroWhile: " + numeroWhile);
        } while (numeroWhile < 3);


        /*
        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable 
        sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
         */
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("numeroFor = " + numeroFor);
        }

        /*
        Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
        Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. 
        También habrá que poner un default para cuando el valor de la variable no sea una estación.
         */
        String estacion = "Otono";
        switch (estacion) {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Otono":
                System.out.println("Es Otono");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("No es una estación");

        }

    }//end main
}
