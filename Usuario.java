import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombreCompleto;
    private List<String> historialBusquedas;

    public Usuario() {
        historialBusquedas = new ArrayList<>();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void agregarBusqueda(String busqueda) {
        historialBusquedas.add(busqueda);
    }

    public List<String> getHistorialBusquedas() {
        return historialBusquedas;
    }
}