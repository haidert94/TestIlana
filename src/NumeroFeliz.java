import java.util.HashSet;
import java.util.Scanner;

public class NumeroFeliz {

    // Método para determinar si un número es feliz
    public static boolean esNumeroFeliz(int n) {
        // Utilizamos un HashSet para detectar ciclos infinitos
        HashSet<Integer> numerosVisitados = new HashSet<>();

        while (n != 1 && !numerosVisitados.contains(n)) {
            // Agregamos el número a la lista de visitados
            numerosVisitados.add(n);
            // Calculamos la suma de los cuadrados de los dígitos
            int sumaCuadrados = 0;
            while (n > 0) {
                int digito = n % 10;
                sumaCuadrados += digito * digito;
                n /= 10;
            }
            n = sumaCuadrados;
        }

        // Si el resultado es 1, el número es feliz; de lo contrario, no lo es
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar un número entero positivo
        System.out.print("Ingrese un número entero positivo: ");

        try {
            int numero = scanner.nextInt();

            if (numero > 0) {
                // Verificar si el número es feliz e imprimir el resultado
                boolean resultado = esNumeroFeliz(numero);
                System.out.println("El número " + numero + " es feliz: " + resultado);
            } else {
                System.out.println("Por favor, ingrese un número entero positivo.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, ingrese un número entero válido.");
        }
    }
}