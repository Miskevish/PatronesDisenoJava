package abstractfactory;

public class BotonLinux implements Boton {

    @Override
    public void mostrar() {
        System.out.println("Mostrando botón estilo Linux.");
    }
}