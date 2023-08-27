package B4;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String telefono;
    private String cedula;
    private Double notasEscolares;
    private String carreraCursar;

    Estudiante (){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Double getNotasEscolares() {
        return notasEscolares;
    }

    public void setNotasEscolares(Double notasEscolares) {
        this.notasEscolares = notasEscolares;
    }

    public String getCarreraCursar() {
        return carreraCursar;
    }

    public void setCarreraCursar(String carreraCursar) {
        this.carreraCursar = carreraCursar;
    }
}
