package abstractfactory;

public class BotonWindows implements Boton {

    @Override
    public void mostrar() {
        System.out.println("Mostrando botón estilo Windows.");
    }
}