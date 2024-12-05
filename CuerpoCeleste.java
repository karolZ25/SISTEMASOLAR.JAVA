public abstract class CuerpoCeleste {
    private String nombre;
    private String descripcion;
    private String imagenPath;

    public CuerpoCeleste(String nombre, String descripcion, String imagenPath) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenPath = imagenPath;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagenPath() {
        return imagenPath;
    }

    public abstract String obtenerInformacionAdicional();
}
