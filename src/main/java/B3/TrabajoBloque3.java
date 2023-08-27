package B3;

public class TrabajoBloque3 {

    public static void main(String[] args) {

        int[] numeros = {3, 0,-1,2,4};

        System.out.println("Arreglo orden invertido: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + "  ");
        }
    }

}