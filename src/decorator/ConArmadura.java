package decorator;

public class ConArmadura extends PersonajeDecorator {

    public ConArmadura(Personaje personaje) {
        super(personaje);
    }

    @Override
    public String obtenerDescripcion() {
        return personaje.obtenerDescripcion() + " + Armadura";
    }

    @Override
    public int obtenerDefensa() {
        return personaje.obtenerDefensa() + 20;
    }
}