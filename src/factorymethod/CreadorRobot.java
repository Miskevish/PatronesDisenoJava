package factorymethod;

public class CreadorRobot extends CreadorEnemigo {

    @Override
    public Enemigo crearEnemigo() {
        return new Robot();
    }
}