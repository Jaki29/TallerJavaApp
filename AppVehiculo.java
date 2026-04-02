// Importa la clase Scanner desde la librería de Java
// Scanner permite leer datos que el usuario escribe en la consola
import java.util.Scanner;

// Definición de la clase principal llamada AppVehiculo
public class AppVehiculo {

    // Método principal, es el punto de inicio del programa
    public static void main(String[] args) {

        // Se crea un objeto Scanner para capturar datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Se solicita al usuario que ingrese la marca del vehículo
        System.out.print("Ingrese la marca: ");
        // Se guarda el valor ingresado en la variable marca
        String marca = scanner.nextLine();

        // Se solicita el modelo del vehículo
        System.out.print("Ingrese el modelo: ");
        // Se guarda el modelo ingresado
        String modelo = scanner.nextLine();

        // Se solicita la cilindrada del vehículo
        System.out.print("Ingrese la cilindrada: ");
        // Se guarda el valor entero ingresado
        int cilindrada = scanner.nextInt();
        // Limpia el buffer para evitar errores al leer texto después
        scanner.nextLine();

        // Se solicita el tipo de combustible
        System.out.print("Ingrese el tipo de combustible: ");
        // Se guarda el tipo de combustible
        String combustible = scanner.nextLine();

        // Se solicita la cantidad de pasajeros
        System.out.print("Ingrese la capacidad en pasajeros: ");
        // Se guarda el número de pasajeros
        int pasajeros = scanner.nextInt();

        // Se muestran los datos ingresados por el usuario
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + pasajeros + " pasajeros.");
    }
}
