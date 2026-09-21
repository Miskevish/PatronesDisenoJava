package factorymethod;

public abstract class CreadorEnemigo {

    public abstract Enemigo crearEnemigo();

    public void generarAtaque() {

        Enemigo enemigo = crearEnemigo();

        enemigo.atacar();
    }
}