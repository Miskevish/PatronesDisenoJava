package abstractfactory;

public class VentanaLinux implements Ventana {

    @Override
    public void mostrar() {
        System.out.println("Mostrando ventana estilo Linux.");
    }
}