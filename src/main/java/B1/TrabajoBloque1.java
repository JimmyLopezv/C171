package B1;
import java.util.Scanner;

public class TrabajoBloque1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        scanner.close();

        int numeroMayor = num1;

        if (num2 > numeroMayor) {
            numeroMayor = num2;
        }

        if (num3 > numeroMayor) {
            numeroMayor = num3;
        }

        System.out.println("El número mayor es: " + numeroMayor);
    }
}