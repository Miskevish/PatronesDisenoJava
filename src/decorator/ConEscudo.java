package decorator;

public class ConEscudo extends PersonajeDecorator {

    public ConEscudo(Personaje personaje) {
        super(personaje);
    }

    @Override
    public String obtenerDescripcion() {
        return personaje.obtenerDescripcion() + " + Escudo";
    }

    @Override
    public int obtenerDefensa() {
        return personaje.obtenerDefensa() + 15;
    }
}