package B2;

public class TrabajoBloque2 {

    public static void main(String[] args) {


        Estudiante estudiante = new Estudiante();
        estudiante.setEdad(28);
        String id = "1144069754";
        estudiante.setNacionalidad("Colombiano");
        estudiante.setName("Nicolas Santacruz");

        int edad;
        edad= estudiante.getEdad();
        String name1;
        name1= estudiante.getName();
        System.out.println("El estudiante "+ name1 + " tiene " + edad + " años.");




    }

}

