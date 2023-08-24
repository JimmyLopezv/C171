package B1;

public class TrabajoBloque1 {
    public static void main(String[] args) {
        int num1=9; // Esto es un numero entero primitivo
        Integer num2=9; // Wrapper int

        System.out.println("Esto es un int primitivo "+num1);
        System.out.println("Esto es un Interger Wrapper "+num2);

        /////////////////////////////////
        double num3=3.3; // Primitivo decimal
        Double num4=3.6; // Wrapper Decimal

        System.out.println("Esto es un double primitivo "+num3);
        System.out.println("Esto es un Double wrapper "+num4);

        //////////////////////////////////////////

        char char1 ='b';
        Character char2 ='B';

        System.out.println("Esto es un caracter prmitivo"+char1);
        System.out.println("Esto es un Caracter Wrapper"+char2);

        /////////////////////

        boolean isTrue =false;
        Boolean isFalse =true;

        System.out.println("Esto es un boolean primitivo"+isTrue);
        System.out.println("Esto es un Boolean Wrapper"+isFalse);

        ////////////////////////////////

        short valores= (short) 32768;
        Short valores2=32767;

        System.out.println("Esto es un short primitivo"+valores);
        System.out.println("Esto es un Boolean Wrapper"+valores2);

    }
}
