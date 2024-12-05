import java.util.List;


public class Planeta extends CuerpoCeleste {
    private boolean tieneAtmosfera;
    private List<String> lunas;
    private double duracionDia;
    private double gravedad;
    private double distanciaDesdeSol;

    public Planeta(String nombre, String descripcion, boolean tieneAtmosfera, List<String> lunas, double duracionDia, double gravedad, double distanciaDesdeSol, String imagenPath) {
        super(nombre, descripcion, imagenPath);
        this.tieneAtmosfera = tieneAtmosfera;
        this.lunas = lunas;
        this.duracionDia = duracionDia;
        this.gravedad = gravedad;
        this.distanciaDesdeSol = distanciaDesdeSol;
    }

    @Override
        public String obtenerInformacionAdicional() {
            return String.format(
            "Duración del día: %.1f horas\nGravedad: %.2f m/s²\nDistancia del Sol: %.1f millones de km\nLunas: %s\nTiene atmósfera: %s",
            duracionDia,
            gravedad,
            distanciaDesdeSol,
            lunas.isEmpty() ? "Ninguna" : String.join(", ", lunas),
            tieneAtmosfera ? "Sí" : "No"
    );
}


    public boolean tieneAtmosfera() {
        return tieneAtmosfera;
    }

    public List<String> getLunas() {
        return lunas;
    }

    public double getDuracionDia() {
        return duracionDia;
    }

    public double getGravedad() {
        return gravedad;
    }

    public double getDistanciaDesdeSol() {
        return distanciaDesdeSol;
    }
}
