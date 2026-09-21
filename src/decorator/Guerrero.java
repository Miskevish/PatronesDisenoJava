package decorator;

public class Guerrero implements Personaje {

    @Override
    public String obtenerDescripcion() {
        return "Guerrero";
    }

    @Override
    public int obtenerDefensa() {
        return 10;
    }
}