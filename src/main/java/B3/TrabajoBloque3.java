package B3;

public class TrabajoBloque3 {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0]=3;
        numeros[1]=0;
        numeros[2]=-1;
        numeros[3]=2;
        numeros[4]=4;

        for (int i = 0; i < numeros.length; i++) {
            Double numeroRadom=Math.random()*10;
            numeros[i]=numeroRadom.intValue();
        }

        for (int num: numeros) {
            System.out.println(num);
        }

    }

}