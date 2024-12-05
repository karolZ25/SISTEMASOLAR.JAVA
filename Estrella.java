public class Estrella extends CuerpoCeleste {
    private double temperatura;
    private double luminosidad;

    public Estrella(String nombre, String descripcion, double temperatura, double luminosidad, String imagenPath) {
        super(nombre, descripcion, imagenPath);
        this.temperatura = temperatura;
        this.luminosidad = luminosidad;
    }

    @Override
    public String obtenerInformacionAdicional() {
        return String.format(
                "Temperatura: %.1f K \nLuminosidad: %.1f veces la del Sol",
                temperatura, luminosidad
        );
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getLuminosidad() {
        return luminosidad;
    }
}
