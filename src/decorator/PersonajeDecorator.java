package decorator;

public abstract class PersonajeDecorator implements Personaje {

    protected Personaje personaje;

    public PersonajeDecorator(Personaje personaje) {
        this.personaje = personaje;
    }
}