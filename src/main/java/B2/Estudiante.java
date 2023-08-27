package B2;

public class Estudiante {

    private String name;
    private boolean genero;
    private int edad;
    private String nacionalidad;
    private String id;
    private String tipoDocumento;
    private String telefono;
    private String Pregrado;
    private String direccionDomicilio;
    private String modoDeTransporte;

    Estudiante(String name,String id,String tipoDocumento){
        this.name=name;
        this.id=id;
        this.tipoDocumento=tipoDocumento;

    }
    Estudiante(){

}

    public String getId() {
        return id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPregrado() {
        return Pregrado;
    }

    public void setPregrado(String pregrado) {
        Pregrado = pregrado;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public String getModoDeTransporte() {
        return modoDeTransporte;
    }

    public void setModoDeTransporte(String modoDeTransporte) {
        this.modoDeTransporte = modoDeTransporte;
    }
}
