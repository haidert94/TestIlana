import java.util.Scanner;

public class FooBar {

    // Método para determinar el resultado según las condiciones dadas
    public static String obtenerResultado(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "FooBar";
        } else if (numero % 3 == 0) {
            return "Foo";
        } else if (numero % 5 == 0) {
            return "Bar";
        } else {
            return String.valueOf(numero);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar un número entero positivo
        System.out.print("Ingrese un número entero positivo: ");

        try {
            int entrada = scanner.nextInt();

            if (entrada > 0) {
                // Obtener y mostrar el resultado
                String resultado = obtenerResultado(entrada);
                System.out.println("Salida: " + resultado);
            } else {
                System.out.println("Por favor, ingrese un número entero positivo.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, ingrese un número entero válido.");
        }
    }
}