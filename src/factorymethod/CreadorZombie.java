package factorymethod;

public class CreadorZombie extends CreadorEnemigo {

    @Override
    public Enemigo crearEnemigo() {
        return new Zombie();
    }
}