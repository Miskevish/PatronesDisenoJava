package factorymethod;

public class Robot implements Enemigo {

    @Override
    public void atacar() {
        System.out.println("El robot dispara con su arma láser.");
    }
}