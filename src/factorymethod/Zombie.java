package factorymethod;

public class Zombie implements Enemigo {

    @Override
    public void atacar() {
        System.out.println("El zombie ataca cuerpo a cuerpo.");
    }
}