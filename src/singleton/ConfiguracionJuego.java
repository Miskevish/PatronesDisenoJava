package singleton;

public class ConfiguracionJuego {

    private static ConfiguracionJuego instancia;

    private int volumen;
    private String dificultad;
    private String idioma;

    private ConfiguracionJuego() {
        volumen = 50;
        dificultad = "Normal";
        idioma = "Español";
    }

    public static ConfiguracionJuego getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionJuego();
        }

        return instancia;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}