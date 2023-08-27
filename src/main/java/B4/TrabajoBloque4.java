package B4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class TrabajoBloque4 {

    private static final Logger logger = LogManager.getLogger(TrabajoBloque4.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            Estudiante estudiante = new Estudiante();


            String nombre = "";
        String apellido = "";
        String cedula = "";
        String telefono = "";
        Double notasEscolares = Double.valueOf("");
        String carreraCursar = "";

        System.out.println("Ingrese nombre del estudiante");
        String nombre = scanner.nextLine();


        try {

            if (nombre == null || nombre.equals("")) {
                throw new Exception("Debe poner el nombre");
            }
            if (apellido == null || apellido.equals("")) {
                throw new Exception("Debe poner el apellido");
            }
            if (cedula == null || cedula.equals("")) {
                throw new Exception("Debe poner la cedula");
            }
            if (telefono == null || telefono.equals("")) {
                throw new Exception("Debe poner el telefono");
            }
            if (notasEscolares == null || notasEscolares.equals("")) {
                throw new Exception("Debe poner las notas escolares");
            }
            if (carreraCursar == null || carreraCursar.equals("")) {
                throw new Exception("Debe poner la carrera a cursar");
            }

        } catch (Exception e) {
            logger.atError().log(e);
        } finally {
            logger.atInfo().log("Prueba");
        }

    }
}
